package com.leroy.wxmin.dao;

import com.leroy.wxmin.acceptvo.AppointmentVO;
import com.leroy.wxmin.model.Appointment;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AppointmentMapper extends Mapper<Appointment> {

    @Select("select appointment.id,repair_shop.name repairName,electric_name electName,electric_age age,electric_pheno pheno," +
            " (case state when '10' then '审核中' when '15' then '预约成功' when '20'then '预约失败' end) state,repair_shop.id  shopId  from appointment" +
            " left join repair_shop on  repair_shop_id = repair_shop.id " +
            " where username like concat('%',#{userName},'%')")
    List<AppointmentVO> selectByuserName(@Param("userName") String userName);

    @Select("select appointment.id,repair_shop.name repairName,electric_name electName,electric_age age,electric_pheno pheno,  username ," +
            " (case state when '10' then '审核中' when '15' then '预约成功' when '20'then '预约失败' end) state  from appointment" +
            " left join repair_shop on  repair_shop_id = repair_shop.id ")
    List<AppointmentVO> selectForAdmin();
}