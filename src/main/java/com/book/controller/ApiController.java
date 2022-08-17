package com.book.controller;

import com.book.entity.RestBean;
import com.book.service.VerifyService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/auth")
public class ApiController {
    @Resource
    VerifyService verifyService;

    @RequestMapping("/verify-code")
    public RestBean<Void> verifyCode(@RequestParam("email") String email) {
        try {
            verifyService.sendVerifyCode(email);
            return new RestBean<>(200, "邮箱发送成功!");
        } catch (Exception e) {
            return new RestBean<>(500, "邮箱发送失败!");
        }
    }
    @PostMapping(value = "/register")
    public RestBean<Void> register(String username,
                                   String password,
                                   String email,
                                   String verify){
        if(verifyService.doVerify(email,verify)) {
//            accountService.createAccount(username,password);
            return new RestBean<>(200,"注册成功！");
        }else
            return new RestBean<>(403,"注册失败，验证码填写错误！");
    }
}
