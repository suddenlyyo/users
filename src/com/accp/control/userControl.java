package com.accp.control;

import com.accp.entity.User;
import com.accp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class userControl {
    @Resource
    private UserService userBiz;

    @RequestMapping("/login.htm")
    public String login(User u){
        User user = userBiz.queryUser(u);
        if(user != null){
            return "jsp/frame";
        }else{
            return "login";
        }
    }

    @RequestMapping("/index.htm")
    public String toLogin(){
        return "login";
    }


    }

