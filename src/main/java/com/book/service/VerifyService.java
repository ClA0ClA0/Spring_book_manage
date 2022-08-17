package com.book.service;

public interface VerifyService {
    void sendVerifyCode(String mail);//发送6位数伪随机验证码
    boolean doVerify(String mail,String code);//验证码验证
}
