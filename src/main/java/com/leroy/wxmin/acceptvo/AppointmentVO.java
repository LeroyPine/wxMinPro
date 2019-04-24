package com.leroy.wxmin.acceptvo;

import com.leroy.wxmin.model.Appointment;

import java.util.Date;

public class AppointmentVO {

    private String id;

    private String repairName;

    private String electName;

    private String pheno;

    private String age;

    private Integer shopId;

    private String date;


    private String openid;

    private String username;

    private String  state;


    public String getRepairName() {
        return repairName;
    }

    public void setRepairName(String repairName) {
        this.repairName = repairName;
    }

    public String getElectName() {
        return electName;
    }

    public void setElectName(String electName) {
        this.electName = electName;
    }

    public String getPheno() {
        return pheno;
    }

    public void setPheno(String pheno) {
        this.pheno = pheno;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Appointment generator(){
        Appointment appointment = new Appointment();
        appointment.setRepairShopId(shopId);
        appointment.setElectricAge(age);
        appointment.setElectricName(electName);
        appointment.setElectricPheno(pheno);
        appointment.setCreateDate(new Date());
        appointment.setAppointmentTime(date);
        appointment.setUsername(username);
        return appointment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
