package com.bean;

public class Message {
    private int mes_id;
    private String mes_name;
    private int mes_age;
    private String mes_sex;
    private String mes_ethnic;
    private String mes_site;
    private String mes_identity;
    private String mes_phone;
    private String mes_image;
    private Card mes_card;
    private Admin mes_admin;
    private Employee mes_emp;
    private User mes_user;
    private Status mes_status;

    public int getMes_id() {
        return mes_id;
    }

    public void setMes_id(int mes_id) {
        this.mes_id = mes_id;
    }

    public String getMes_name() {
        return mes_name;
    }

    public void setMes_name(String mes_name) {
        this.mes_name = mes_name;
    }

    public int getMes_age() {
        return mes_age;
    }

    public void setMes_age(int mes_age) {
        this.mes_age = mes_age;
    }

    public String getMes_sex() {
        return mes_sex;
    }

    public void setMes_sex(String mes_sex) {
        this.mes_sex = mes_sex;
    }

    public String getMes_ethnic() {
        return mes_ethnic;
    }

    public void setMes_ethnic(String mes_ethnic) {
        this.mes_ethnic = mes_ethnic;
    }

    public String getMes_site() {
        return mes_site;
    }

    public void setMes_site(String mes_site) {
        this.mes_site = mes_site;
    }

    public String getMes_identity() {
        return mes_identity;
    }

    public void setMes_identity(String mes_identity) {
        this.mes_identity = mes_identity;
    }

    public String getMes_phone() {
        return mes_phone;
    }

    public void setMes_phone(String mes_phone) {
        this.mes_phone = mes_phone;
    }

    public String getMes_image() {
        return mes_image;
    }

    public void setMes_image(String mes_image) {
        this.mes_image = mes_image;
    }

    public Card getMes_card() {
        return mes_card;
    }

    public void setMes_card(Card mes_card) {
        this.mes_card = mes_card;
    }

    public Admin getMes_admin() {
        return mes_admin;
    }

    public void setMes_admin(Admin mes_admin) {
        this.mes_admin = mes_admin;
    }

    public Employee getMes_emp() {
        return mes_emp;
    }

    public void setMes_emp(Employee mes_emp) {
        this.mes_emp = mes_emp;
    }

    public User getMes_user() {
        return mes_user;
    }

    public void setMes_user(User mes_user) {
        this.mes_user = mes_user;
    }

    public Status getMes_status() {
        return mes_status;
    }

    public void setMes_status(Status mes_status) {
        this.mes_status = mes_status;
    }

    @Override
    public String toString() {
        return "Message{" +
                "mes_id=" + mes_id +
                ", mes_name='" + mes_name + '\'' +
                ", mes_age=" + mes_age +
                ", mes_sex='" + mes_sex + '\'' +
                ", mes_ethnic='" + mes_ethnic + '\'' +
                ", mes_site='" + mes_site + '\'' +
                ", mes_identity='" + mes_identity + '\'' +
                ", mes_phone='" + mes_phone + '\'' +
                ", mes_image='" + mes_image + '\'' +
                ", mes_card=" + mes_card +
                ", mes_admin=" + mes_admin +
                ", mes_emp=" + mes_emp +
                ", mes_user=" + mes_user +
                ", mes_status=" + mes_status +
                '}';
    }
}
