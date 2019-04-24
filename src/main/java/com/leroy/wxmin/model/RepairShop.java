package com.leroy.wxmin.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "repair_shop")
public class RepairShop implements Serializable {
    /**
     * reparir
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String photo;

    private String name;

    private String description;

    private String address;

    @Column(name = "browser_num")
    private Integer browserNum;

    private static final long serialVersionUID = 1L;

    /**
     * 获取reparir
     *
     * @return id - reparir
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置reparir
     *
     * @param id reparir
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return browser_num
     */
    public Integer getBrowserNum() {
        return browserNum;
    }

    /**
     * @param browserNum
     */
    public void setBrowserNum(Integer browserNum) {
        this.browserNum = browserNum;
    }
}