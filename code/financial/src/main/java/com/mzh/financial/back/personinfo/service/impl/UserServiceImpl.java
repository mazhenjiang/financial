package com.mzh.financial.back.personinfo.service.impl;

import com.mzh.base.domain.ResponseDTO;
import com.mzh.financial.back.personinfo.dao.TDataUserMapper;
import com.mzh.financial.back.personinfo.domain.TDataUser;
import com.mzh.financial.back.personinfo.domain.TDataUserExample;
import com.mzh.financial.back.personinfo.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    TDataUserMapper tDataUserMapper;

    @Override
    public void insertUserinfo(TDataUser userInfo) {
//     判空
        if (Objects.isNull(userInfo)) {
            return;
        }
    }

    @Override
    public void insertUserinfo(int accountId) {
//        判断账户id不能为空
        if (Objects.isNull(accountId)) {
            return;
        }
//        添加默认用户信息
        TDataUser record = new TDataUser();
        record.setAccountId(accountId);
        record.setCreateTime(new Date());
        this.tDataUserMapper.insertSelective(record);
    }

    @Override
    public ResponseDTO<Void> updateUserinfo(TDataUser targetUserInfo) {
        ResponseDTO<Void> res = new ResponseDTO<>();
        res.setCode("200");
        res.setMsg("更新信息成功");
        //判空
        if (Objects.isNull(targetUserInfo)) {
            res.setCode("100");
            res.setMsg("操作失败,前端传入的用户信息为空");
            return res;
        }
        if (Objects.isNull(targetUserInfo.getAccountId())) {
            res.setCode("100");
            res.setMsg("操作失败,前端传入的账户ID为空");
            return res;
        }
        //通过accountId 判断此用户信息是否存在
        List<TDataUser> tDataUsers = new ArrayList<>();
        if (Objects.nonNull(targetUserInfo.getAccountId())) {
            TDataUserExample userExample = new TDataUserExample();
            TDataUserExample.Criteria criteria = userExample.createCriteria();
            criteria.andAccountIdEqualTo(targetUserInfo.getAccountId());
            long count = this.tDataUserMapper.countByExample(userExample);
            if (count != 1) {
                res.setCode("100");
                res.setMsg("更新失败,未能查询用户信息");
                return res;
            }
            tDataUsers = this.tDataUserMapper.selectByExample(userExample);
        }

        // 判断手机号重复
        if (StringUtils.isNotBlank(targetUserInfo.getTel())) {
            TDataUserExample userExample = new TDataUserExample();
            TDataUserExample.Criteria criteria = userExample.createCriteria();
            criteria.andTelEqualTo(targetUserInfo.getTel());
            long count = this.tDataUserMapper.countByExample(userExample);
            if (count > 0) {
                res.setCode("100");
                res.setMsg("操作失败,电话信息重复");
                return res;
            }
        }
        // 判断电子邮箱重复
        if (StringUtils.isNotBlank(targetUserInfo.getEmail())) {
            TDataUserExample userExample = new TDataUserExample();
            TDataUserExample.Criteria criteria = userExample.createCriteria();
            criteria.andEmailEqualTo(targetUserInfo.getEmail());
            long count = this.tDataUserMapper.countByExample(userExample);
            if (count > 0) {
                res.setCode("100");
                res.setMsg("操作失败,邮件号重复");
                return res;
            }
        }

        //获取当前用户信息
        if (CollectionUtils.isNotEmpty(tDataUsers)) {
            TDataUser tDataUserDB = tDataUsers.get(0);
            tDataUserDB.setSex(targetUserInfo.getSex());
            tDataUserDB.setTel(targetUserInfo.getTel());
            tDataUserDB.setUserName(targetUserInfo.getUserName());
            tDataUserDB.setAge(targetUserInfo.getAge());
            tDataUserDB.setEmail(targetUserInfo.getEmail());

            TDataUserExample userIdExample = new TDataUserExample();
            TDataUserExample.Criteria criteria = userIdExample.createCriteria();
            criteria.andIdEqualTo(tDataUserDB.getId());
            this.tDataUserMapper.updateByExampleSelective(tDataUserDB, userIdExample);
        }
        return res;
    }

    @Override
    public void delUserinfoByAccountId(int accountId) {

    }

    @Override
    public void getUserinfoByAccountId(int accountId) {

    }
}
