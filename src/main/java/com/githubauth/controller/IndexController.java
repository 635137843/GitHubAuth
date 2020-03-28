package com.githubauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author xin
 * @Date 2020/3/28 17:54
 * @Version 1.0
 **/
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
