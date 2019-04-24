package com.leroy.wxmin.outvo;

import io.swagger.annotations.ApiModel;

import javax.persistence.Column;

@ApiModel(value = "登陆返回的VO类")
public class LoginOutVO {

    private Integer id;

    private String photo;

    private String name;

    private String description;

    private String address;

    @Column(name = "browser_num")
    private Integer browserNum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getBrowserNum() {
        return browserNum;
    }

    public void setBrowserNum(Integer browserNum) {
        this.browserNum = browserNum;
    }
}
