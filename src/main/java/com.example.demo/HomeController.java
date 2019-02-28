package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {




    @RequestMapping("/loadform")
    public String loadFormPage(){
        return "formtemplate";
    }
    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("login") String login, Model model){
        model.addAttribute("loginval", login);
        return "confirm";
    }
    // Added a new Error method, to throw when Webpage runs into 404 error
//    @RequestMapping("/error")
//    public String loadFromPage(@RequestParam("error") String error, Model model){
//        model.addAttribute("errorval", error);
//        return "error";
//    }

}