package com.bean;

import java.util.Date;

public class Card {
    private int card_id;
    private String card_account;
    private int card_pwd;
    private Date card_time;
    private double card_money;
    private int card_internetbank;
    private Employee card_emp;
    private Status card_status;

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public String getCard_account() {
        return card_account;
    }

    public void setCard_account(String card_account) {
        this.card_account = card_account;
    }

    public int getCard_pwd() {
        return card_pwd;
    }

    public void setCard_pwd(int card_pwd) {
        this.card_pwd = card_pwd;
    }

    public Date getCard_time() {
        return card_time;
    }

    public void setCard_time(Date card_time) {
        this.card_time = card_time;
    }

    public double getCard_money() {
        return card_money;
    }

    public void setCard_money(double card_money) {
        this.card_money = card_money;
    }

    public int getCard_internetbank() {
        return card_internetbank;
    }

    public void setCard_internetbank(int card_internetbank) {
        this.card_internetbank = card_internetbank;
    }

    public Employee getCard_emp() {
        return card_emp;
    }

    public void setCard_emp(Employee card_emp) {
        this.card_emp = card_emp;
    }

    public Status getCard_status() {
        return card_status;
    }

    public void setCard_status(Status card_status) {
        this.card_status = card_status;
    }

    @Override
    public String toString() {
        return "Card{" +
                "card_id=" + card_id +
                ", card_account='" + card_account + '\'' +
                ", card_pwd=" + card_pwd +
                ", card_time=" + card_time +
                ", card_money=" + card_money +
                ", card_internetbank=" + card_internetbank +
                ", card_emp=" + card_emp +
                ", card_status=" + card_status +
                '}';
    }
}
