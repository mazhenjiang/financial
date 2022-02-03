package com.mzh.financial.back.admin.accountmng.controller;

import com.mzh.base.domain.ResponseDTO;
import com.mzh.financial.back.admin.accountmng.domain.TDataAccount;
import com.mzh.financial.back.admin.accountmng.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/check_insert.do")
    public ResponseDTO<Void> checkAndInsertAccount(String accountName, String pwd) {
        return this.accountService.checkAndInsertAccountInfo(accountName, pwd);
    }

    @RequestMapping("/list.do")
    public ResponseDTO<List<TDataAccount>> listAccount(String accountName, String tel, String email) {
        return this.accountService.listAccountInfo(accountName, tel, email);
    }

    @RequestMapping("/update_pwd_admin.do")
    public ResponseDTO<Void> updatePwdAccount(String accountName, String newPwd1, String newPwd2) {
        return this.accountService.updateAccountPwdByAdmin(accountName, newPwd1, newPwd2);
    }

    @RequestMapping("/update_pwd_personal.do")
    public ResponseDTO<Void> updatePwdAccount(String accountName, String oldPwd, String newPwd1, String newPwd2) {
        return this.accountService.updateAccountPwdByPersonal(accountName, oldPwd, newPwd1, newPwd2);
    }

    @RequestMapping("/del.do")
    public ResponseDTO<Void> delAccountById(String id) {
        this.accountService.deleteAccountInfoById(id);
        return ResponseDTO.success(null);
    }
}
