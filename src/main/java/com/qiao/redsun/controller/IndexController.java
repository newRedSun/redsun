package com.qiao.redsun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: qiaojunhui
 * @time: 2020/3/17 11:11 下午
 */
@Controller
public class IndexController {

    @GetMapping("hello")
    public String index() {
        return "index";
    }

}
