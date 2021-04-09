package com.ck.handler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserHandler {


    //直接跳转到登录页面
    @RequestMapping("/")
    public String toLogin(){
        return "login";
    }

    //登录功能
    @RequestMapping("login")
    public String login(){
        return "redirect:toPage?page=index";
    }

    @RequestMapping("toPage")
    public String toPage(String page){
        return "/page/"+page;
    }
}
