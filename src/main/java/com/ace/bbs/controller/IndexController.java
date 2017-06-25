package com.ace.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/25.
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String showIndex() {
        return "";
    }
}
