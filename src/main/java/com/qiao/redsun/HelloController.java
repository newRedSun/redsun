package com.qiao.redsun;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: qiaojunhui
 * @time: 2020/3/17 11:11 下午
 */
@Controller
public class HelloController {

    @GetMapping("hello")
    public String great(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

}
