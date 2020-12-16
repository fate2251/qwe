package com.controller;

import com.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @RequestMapping("index")
    public String loadindex(HttpServletRequest req){
        User u = new User();
        u.setUser_account("123");
        u.setUser_pwd("123");
        req.getSession().setAttribute("u",u);
        return "html/index";
    }
}
