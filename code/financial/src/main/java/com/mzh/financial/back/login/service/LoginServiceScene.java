package com.mzh.financial.back.login.service;

import com.mzh.financial.back.admin.accountmng.dao.TDataAccountMapper;
import com.mzh.financial.back.admin.accountmng.domain.TDataAccountExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录服务场景
 */
@Service
public class LoginServiceScene {

    @Autowired
    TDataAccountMapper accountMapper;

    /**
     * 登录
     *
     * @param accountName
     * @param pwd
     * @param loginFlag   :登录标识 1-账户名，2-手机号，3-邮箱号
     * @return
     */
    public long login(String accountName, String pwd, String loginFlag) {
        long res = 0;
        if (StringUtils.isBlank(accountName) ||
                StringUtils.isBlank(pwd)||
                StringUtils.isBlank(loginFlag)) {
            return res;
        }
        TDataAccountExample accountExample = new TDataAccountExample();
        TDataAccountExample.Criteria criteria = accountExample.createCriteria();
        //登录标识 1-账户名，2-手机号，3-邮箱号
        if("1".equals(loginFlag)){
            criteria.andAccountNameEqualTo(accountName);
        }else if("2".equals(loginFlag)){
            criteria.andTelEqualTo(accountName);
        }else if("3".equals(loginFlag)){
            criteria.andEmailEqualTo(accountName);
        }
        criteria.andPwdEqualTo(pwd);
        res = this.accountMapper.countByExample(accountExample);
        return res;
    }
}
