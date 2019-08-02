package com.inspur.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloControl {

//    @RequestMapping({"/","/index.html"})
//    public  String index(){
//        return "index";
//    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello Worldhhhh888555555555555555586666";
    }


    @RequestMapping("/success")
    public String success(Map<String ,Object>map){
        map.put("hello","<h1>撒大声地所多</h1>");
        return "success";
    }
}
