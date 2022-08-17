package com.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageContoller {
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
}
