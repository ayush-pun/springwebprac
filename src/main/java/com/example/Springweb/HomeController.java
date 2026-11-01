package com.example.Springweb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String hello() {
        System.out.println("method called");
        System.out.println("working dir: " + System.getProperty("user.dir"));
        return "index.jsp";
    }
    @RequestMapping("add")
    public String add(int num1, @RequestParam("num2") int secondnum, HttpSession session){

        int result = num1 + secondnum;
        session.setAttribute("result",result);
        return "result.jsp";
    }
}
