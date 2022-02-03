package com.mzh.financial.back.admin.accountmng.service.impl;

import com.mzh.base.domain.ResponseDTO;
import com.mzh.financial.back.admin.accountmng.dao.TDataAccountMapper;
import com.mzh.financial.back.admin.accountmng.domain.TDataAccount;
import com.mzh.financial.back.admin.accountmng.domain.TDataAccountExample;
import com.mzh.financial.back.admin.accountmng.service.AccountService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    TDataAccountMapper tDataAccountMapper;

    @Override
    public ResponseDTO<Void> checkAndInsertAccountInfo(String accountName, String pwd) {
        ResponseDTO<Void> res = new ResponseDTO<>();
        res.setCode("200");
        res.setMsg("操作成功");
        //判空
        if (StringUtils.isBlank(accountName)) {
            res.setCode("100");
            res.setMsg("操作失败,账户名不能为空");
            return res;
        }
        //判断是否已存在该账户
        TDataAccountExample accountExample = new TDataAccountExample();
        TDataAccountExample.Criteria criteria = accountExample.createCriteria();
        criteria.andAccountNameEqualTo(accountName);
        long count = this.tDataAccountMapper.countByExample(accountExample);
        if (count > 0) {
            res.setCode("100");
            res.setMsg("操作失败,账户名已存在");
            return res;
        }
        //添加账户
        TDataAccount record = new TDataAccount();
        record.setAccountName(accountName);
        if (StringUtils.isBlank(pwd)) {
            record.setPwd("123456");
        } else {
            record.setPwd(pwd);
        }
        this.tDataAccountMapper.insertSelective(record);
        return res;
    }

    @Override
    public ResponseDTO<List<TDataAccount>> listAccountInfo(String accountName, String tel, String email) {
        TDataAccountExample accountExample = new TDataAccountExample();
        TDataAccountExample.Criteria criteria = accountExample.createCriteria();
        if (StringUtils.isNotBlank(accountName)) {
            criteria.andAccountNameLike(accountName);
        }
        if (StringUtils.isNotBlank(tel)) {
            criteria.andTelLike(tel);
        }
        if (StringUtils.isNotBlank(email)) {
            criteria.andEmailLike(email);
        }
        List<TDataAccount> tDataAccounts = this.tDataAccountMapper.selectByExample(accountExample);
        for (TDataAccount tDataAccount : tDataAccounts) {
            tDataAccount.setPwd("");
        }
        return ResponseDTO.success(tDataAccounts);
    }

    @Override
    public void getAccountInfoByAccountName(String accountName) {

    }

    @Override
    public void getAccountInfoById(int id) {

    }

    @Override
    public ResponseDTO<Void> updateAccountPwdByPersonal(String accountName, String oldPwd, String newPwd1, String newPwd2) {
        ResponseDTO<Void> res=new ResponseDTO<>();
        if (StringUtils.isBlank(oldPwd)) {
            res.setCode("100");
            res.setMsg("操作失败,旧密码不能为空,请输入");
            return res;
        }
        res  = this.commonUpdatePwd(accountName, oldPwd, newPwd1, newPwd2);

        if ("100".equals(res.getCode())) {
            return res;
        }
        //更新密码
        TDataAccount record = new TDataAccount();
        record.setPwd(newPwd1);
        TDataAccountExample accountExample = new TDataAccountExample();
        TDataAccountExample.Criteria criteria = accountExample.createCriteria();
        criteria.andAccountNameEqualTo(accountName);
        this.tDataAccountMapper.updateByExampleSelective(record, accountExample);

        return res;
    }

    @Override
    public ResponseDTO<Void> updateAccountPwdByAdmin(String accountName, String newPwd1, String newPwd2) {
        ResponseDTO<Void> res = this.commonUpdatePwd(accountName, null, newPwd1, newPwd2);
        if ("100".equals(res.getCode())) {
            return res;
        }

        //更新密码
        TDataAccount record = new TDataAccount();
        record.setPwd(newPwd1);
        TDataAccountExample accountExample = new TDataAccountExample();
        TDataAccountExample.Criteria criteria = accountExample.createCriteria();
        criteria.andAccountNameEqualTo(accountName);
        this.tDataAccountMapper.updateByExampleSelective(record, accountExample);

        return res;
    }


    private ResponseDTO<Void> commonUpdatePwd(String accountName, String oldPwd, String newPwd1, String newPwd2) {
        ResponseDTO<Void> res = ResponseDTO.success("200", "更新密码成功");
        //两次输入密码比较
        if (StringUtils.isBlank(accountName)) {
            res.setCode("100");
            res.setMsg("操作失败,账户名不能为空");
            return res;
        }
        if (StringUtils.isBlank(newPwd1)
                || StringUtils.isBlank(newPwd2)) {
            res.setCode("100");
            res.setMsg("操作失败,新密码不能为空");
            return res;
        }
        if (!newPwd1.equals(newPwd2)) {
            res.setCode("100");
            res.setMsg("操作失败,两次输入的密码不一样,请重新输入");
            return res;
        }
        //数据库判断,账户是否为空
        TDataAccountExample accountExample = new TDataAccountExample();
        TDataAccountExample.Criteria criteria = accountExample.createCriteria();
        criteria.andAccountNameEqualTo(accountName);
        List<TDataAccount> tDataAccounts = this.tDataAccountMapper.selectByExample(accountExample);
        if (CollectionUtils.isEmpty(tDataAccounts)) {
            res.setCode("100");
            res.setMsg("操作失败,账户名在数据库中未找到");
            return res;
        }
        if (StringUtils.isNotBlank(oldPwd)) {
            TDataAccount tDataAccount = tDataAccounts.get(0);
            String pwdDB = tDataAccount.getPwd();
            if (!oldPwd.equals(pwdDB)) {
                res.setCode("100");
                res.setMsg("操作失败,旧密码输入错误,请重新输入");
                return res;
            }
        }

        return res;
    }

    @Override
    public void deleteAccountInfoById(String id) {
        if(StringUtils.isBlank(id)){
            return;
        }
        this.tDataAccountMapper.deleteByPrimaryKey(Integer.valueOf(id));
    }
}
