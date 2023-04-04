package com.study.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller1 {

    //Servlet 에서 RequestMapping(value = "/page1", method= RequestMethod.GET)
    @GetMapping("/page1")
    public String page1(){
        return "page1";  //연결하려는 html 파일명을 써준다.
    }
    @GetMapping("/page2")
    public String page2(){
        return "page2";
    }
}
