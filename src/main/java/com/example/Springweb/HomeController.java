package com.example.Springweb;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String hello() {
        System.out.println("method called");
        System.out.println("working dir: " + System.getProperty("user.dir"));
        return "index";
    }
    @RequestMapping("add")
    public ModelAndView add(int num1, @RequestParam("num2") int secondnum, ModelAndView mv){

        int result = num1 + secondnum;
        mv.addObject("result",result);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("addAlien")
    public ModelAndView addAlien(@ModelAttribute Alien alien
            , ModelAndView modelAndView){


        modelAndView.setViewName("result");
        return modelAndView;

    }
    @ModelAttribute("course")
    public String courseName(){
        return "java";
    }
}
