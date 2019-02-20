package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jiang
 * @date 2018/4/27
 * @time 15:08
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/info.html")
    public String info(){
        return "info";
    }

    @GetMapping("/own.html")
    public String own(){
        return "own";
    }

    @GetMapping("/quan.html")
    public String quan(){
        return "quan";
    }
}
