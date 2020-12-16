package com.bean;

import java.util.Date;
import net.sf.json.JSONObject;

public class Employee {
    private int emp_id;
    private String emp_account;
    private String emp_pwd;
    private Date emp_time;
    private int emp_status;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_account() {
        return emp_account;
    }

    public void setEmp_account(String emp_account) {
        this.emp_account = emp_account;
    }

    public String getEmp_pwd() {
        return emp_pwd;
    }

    public void setEmp_pwd(String emp_pwd) {
        this.emp_pwd = emp_pwd;
    }

    public Date getEmp_time() {
        return emp_time;
    }

    public void setEmp_time(Date emp_time) {
        this.emp_time = emp_time;
    }

    public int getEmp_status() {
        return emp_status;
    }

    public void setEmp_status(int emp_status) {
        this.emp_status = emp_status;
    }

    @Override
    public String toString() {
        return JSONObject.fromObject(this).toString();
    }
}
