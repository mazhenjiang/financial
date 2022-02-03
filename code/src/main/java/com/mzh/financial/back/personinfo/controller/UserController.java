package com.mzh.financial.back.personinfo.controller;

import com.mzh.base.domain.ResponseDTO;
import com.mzh.financial.back.personinfo.domain.TDataUser;
import com.mzh.financial.back.personinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/insert.do")
    public ResponseDTO<Void> insertUser(int accountId) {
        this.userService.insertUserinfo(accountId);
        return ResponseDTO.success(null);
    }
    @RequestMapping("/update.do")
    public ResponseDTO<Void> updateUser(TDataUser userInfo) {
        this.userService.updateUserinfo(userInfo);
        return ResponseDTO.success(null);
    }

}
