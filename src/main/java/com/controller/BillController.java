package com.controller;

import com.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("bill")
public class BillController {
    @Autowired
    BillService billServiceImpl;

    @ResponseBody
    @RequestMapping("findBillSumMoneyBytime")
    public List<Double> findBillSumMoneyBytime(){
        Calendar cal = Calendar.getInstance();
        int d = 0;
        if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
            d = -7;
        } else {
            d = 1 - cal.get(Calendar.DAY_OF_WEEK);
        }
        cal.add(Calendar.DAY_OF_WEEK, d);
        List<Double> NumberList = new ArrayList<Double>();
        for(int i = 1 ; i <= 7 ; i++){
            cal.add(Calendar.DAY_OF_WEEK, 1);
            String data2 = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
            Double number = billServiceImpl.findBillSumMoneyBytimeAndStatus(data2,4);
            Double number1 = billServiceImpl.findBillSumMoneyBytimeAndStatus(data2,5);
            NumberList.add(number);
            NumberList.add(number1);
        }

        return NumberList;
    }
}
