package com.controller;

import com.bean.Employee;
import com.service.EmployeeService;
import com.util.Layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeServiceImpl;
    @ResponseBody
    @RequestMapping("findEmpAll")
    public Layui findEmpAll(){
        List<Employee> list = employeeServiceImpl.findEmpAll();
        Layui layui = Layui.data(list.size(),list);
        for (Employee emp:list) {
            System.out.println(emp);
        }
        return layui;
    }
}
