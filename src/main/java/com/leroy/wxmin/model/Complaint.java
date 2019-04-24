package com.leroy.wxmin.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Complaint implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "repair_shop_id")
    private Integer repairShopId;

    @Column(name = "user_name")
    private String userName;

    private String content;

    @Column(name = "create_date")
    private Date createDate;


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
     * @return repair_shop_id
     */
    public Integer getRepairShopId() {
        return repairShopId;
    }

    /**
     * @param repairShopId
     */
    public void setRepairShopId(Integer repairShopId) {
        this.repairShopId = repairShopId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}