package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWord {
    @RequestMapping("/welcome")
    public String welcome(){ return "html/welcome";}
    @RequestMapping("/left")
    public String left(){ return "htmlleft";}
    @RequestMapping("/login")
    public String login(){ return "html/login";}
    @RequestMapping("/welcome1")
    public String welcome1(){ return "html/welcome1";}
    @RequestMapping("/employee")
    public String employee(){ return "html/employee";}
    @RequestMapping("/addEmployee")
    public String addEmployee(){ return "html/addEmployee";}
}
