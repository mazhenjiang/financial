package com.mzh.financial.back.login.controller;

import com.mzh.base.domain.ResponseDTO;
import com.mzh.financial.back.login.service.LoginServiceScene;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 登录Controller
 */
@RestController
@RequestMapping
public class LoginController {
    @Autowired
    LoginServiceScene loginServiceScene;

    @RequestMapping("/login")
    @ResponseBody
    public ResponseDTO<Void> login(@RequestParam(name = "phone")String phone,
                             @RequestParam(name = "pwd")String pwd){
        ResponseDTO<Void> res=new ResponseDTO<>();
        //检查
        if(StringUtils.isBlank(phone)||StringUtils.isBlank(pwd)){
            res.setCode("100");
            res.setMsg("账户名密码不能为空");
            return res;
        }
        //sql: select count(*) from t_data_account where tel='18636948921' and pwd ='123123'
        long count = this.loginServiceScene.login(phone, pwd, "2");
        if(count>0){
            res.setCode("200");
            res.setMsg("登录成功");
        }else{
            res.setCode("100");
            res.setMsg("账户名密码错误");
        }
        return res;
    }
}
