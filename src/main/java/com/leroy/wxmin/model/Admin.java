package com.leroy.wxmin.model;

import java.io.Serializable;
import javax.persistence.*;

public class Admin implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String adminname;

    private String pwd;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return adminname
     */
    public String getAdminname() {
        return adminname;
    }

    /**
     * @param adminname
     */
    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    /**
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}