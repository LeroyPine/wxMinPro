package com.leroy.wxmin.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Appointment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "repair_shop_id")
    private Integer repairShopId;

    @Column(name = "electric_name")
    private String electricName;

    @Column(name = "electric_age")
    private String electricAge;

    @Column(name = "electric_pheno")
    private String electricPheno;

    @Column(name = "appointment_time")
    private String appointmentTime;

    @Column(name = "create_date")
    private Date createDate;

    private String username;

    private String state;

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

    /**
     * @return electric_name
     */
    public String getElectricName() {
        return electricName;
    }

    /**
     * @param electricName
     */
    public void setElectricName(String electricName) {
        this.electricName = electricName;
    }

    public String getElectricAge() {
        return electricAge;
    }

    public void setElectricAge(String electricAge) {
        this.electricAge = electricAge;
    }

    /**
     * @return electric_pheno
     */
    public String getElectricPheno() {
        return electricPheno;
    }

    /**
     * @param electricPheno
     */
    public void setElectricPheno(String electricPheno) {
        this.electricPheno = electricPheno;
    }

    /**
     * @return appointment_time
     */
    public String getAppointmentTime() {
        return appointmentTime;
    }

    /**
     * @param appointmentTime
     */
    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}