package com.ace.bbs.controller;

import com.ace.bbs.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/25.
 */
@Controller
public class SignController {

    @RequestMapping("/signup")
    public String signup(User user) {
        return "bbs/sign/signup";
    }

    @RequestMapping("/signin")
    public String signin() {
        return "";
    }

    @RequestMapping("/signout")
    public String signout() {
        return "";
    }
}
