package com.ck.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserHandler {

    //登录功能
    @RequestMapping("login")
    public String login(){
        return "page/index";
    }
}
