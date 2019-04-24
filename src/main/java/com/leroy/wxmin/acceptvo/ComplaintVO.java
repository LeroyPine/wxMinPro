package com.leroy.wxmin.acceptvo;

import java.util.Date;

public class ComplaintVO {

    private Integer complaintId;


private Integer  appointmentId;
    private String userName;

    private String content;

    private Date createDate;

    private String  repairShopName;


    public Integer getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(Integer complaintId) {
        this.complaintId = complaintId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRepairShopName() {
        return repairShopName;
    }

    public void setRepairShopName(String repairShopName) {
        this.repairShopName = repairShopName;
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }
}
