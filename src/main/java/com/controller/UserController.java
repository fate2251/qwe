package com.controller;

import com.service.CardService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;
    @Autowired
    private CardService cardServiceImpl;
    @RequestMapping("hello")
    public String hello(){
        System.out.println("HelloWord!!!:"+userService.selectUserAccount("1887435682"));
        return "login";
    }
    @ResponseBody
    @RequestMapping("findUserBytime")
    public List<Integer> findUserBytime() throws ParseException {
        Calendar cal = Calendar.getInstance();
        int d = 0;
        if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
            d = -7;
        } else {
            d = 1 - cal.get(Calendar.DAY_OF_WEEK);
        }
        cal.add(Calendar.DAY_OF_WEEK, d);
        List<Integer> NumberList = new ArrayList<Integer>();
        for(int i = 1 ; i <= 7 ; i++){
            cal.add(Calendar.DAY_OF_WEEK, 1);
            String data2 = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
            int number = userService.findUserBytrme(data2);
            int number1 = cardServiceImpl.findCardBytrme(data2);
            NumberList.add(number);
            NumberList.add(number1);
        }

        return NumberList;
    }
}
