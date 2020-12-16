package com;

import com.bean.Admin;
import com.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Text {
    @Autowired
    AdminService adminServiceImpl;
    @Test
    public void admin(){
        Admin a = new Admin();
        a.setAdmin_account("dlyh02");
        a.setAdmin_pwd("123");
        Admin ad = adminServiceImpl.findAdminByAccountAndPwd(a);
        System.out.println(ad);
    }
}
