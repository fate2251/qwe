package com.bean;

import java.util.Date;

public class Admin {
    private int admin_id;
    private String admin_account;
    private String admin_pwd;
    private Date admin_time;

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_account() {
        return admin_account;
    }

    public void setAdmin_account(String admin_account) {
        this.admin_account = admin_account;
    }

    public String getAdmin_pwd() {
        return admin_pwd;
    }

    public void setAdmin_pwd(String admin_pwd) {
        this.admin_pwd = admin_pwd;
    }

    public Date getAdmin_time() {
        return admin_time;
    }

    public void setAdmin_time(Date admin_time) {
        this.admin_time = admin_time;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + admin_id +
                ", admin_account='" + admin_account + '\'' +
                ", admin_pwd='" + admin_pwd + '\'' +
                ", admin_time=" + admin_time +
                '}';
    }
}
