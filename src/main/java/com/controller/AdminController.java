package com.controller;

import com.bean.Admin;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    AdminService adminServiceImpl;
    @ResponseBody
    @RequestMapping("login")
    public String login(Admin admin, HttpServletRequest req){
        req.getSession().setAttribute("admin",admin);
        System.out.println(admin);
        Admin admin1 = adminServiceImpl.findAdminByAccountAndPwd(admin);
        if(admin1 == null){
            return "null";
        }
        return "index";
    }
}
