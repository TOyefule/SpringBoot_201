package com.example.demo;


@Controller
public class HomeController {
    @RequestMapping("/loadform")
    public String loadFormPage(){
        return "formtemplate";
    }
    @RequestMapping("/proccessform")
    public String loadFromPage(@RequestParam("login") String login,
                               Model model){
        model.addAttribute("loginval", login);
        return "confirm";
    }
}