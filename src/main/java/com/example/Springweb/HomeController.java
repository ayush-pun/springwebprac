package com.example.Springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String hello() {
        System.out.println("method called");
        System.out.println("working dir: " + System.getProperty("user.dir"));
        return "index.jsp";
    }
}
