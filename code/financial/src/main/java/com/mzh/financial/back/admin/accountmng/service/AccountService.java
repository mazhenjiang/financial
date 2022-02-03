package com.mzh.financial.back.admin.accountmng.service;

import com.mzh.base.domain.ResponseDTO;
import com.mzh.financial.back.admin.accountmng.domain.TDataAccount;

import java.util.List;

public interface AccountService {


    /**
     * 检查账户信息是否重复;若不重复则添加
     *
     * @param accountName
     */
    ResponseDTO<Void> checkAndInsertAccountInfo(String accountName, String pwd);


    /**
     * 查询全部账户信息
     */
    ResponseDTO<List<TDataAccount>> listAccountInfo(String accountName, String tel, String email);

    /**
     * 查询单个账户信息
     *
     * @param accountName
     */
    void getAccountInfoByAccountName(String accountName);

    /**
     * 查询单个账户信息
     *
     * @param id
     */
    void getAccountInfoById(int id);


    /**
     * 个人更新密码
     *
     * @param accountName
     * @param oldPwd
     * @param newPwd1
     * @param newPwd2
     */
    ResponseDTO<Void> updateAccountPwdByPersonal(String accountName, String oldPwd, String newPwd1, String newPwd2);


    /**
     * 管理员更新密码
     *
     * @param accountName
     * @param newPwd1
     * @param newPwd2
     */
    ResponseDTO<Void> updateAccountPwdByAdmin(String accountName, String newPwd1, String newPwd2);


    /**
     * 注销账户
     *
     * @param id
     */
    void deleteAccountInfoById(String id);
}
