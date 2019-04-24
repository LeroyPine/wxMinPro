package com.leroy.wxmin.dao;

import com.leroy.wxmin.acceptvo.ComplaintVO;
import com.leroy.wxmin.model.Complaint;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ComplaintMapper extends Mapper<Complaint> {

    @Select("SELECT complaint.id complaintId,appointment.id appointmentId," +
            " (SELECT NAME FROM repair_shop WHERE  repair_shop.id = appointment.repair_shop_id) repairShopName," +
            " user_name userName ,content,complaint.create_date createDate FROM  complaint  LEFT JOIN  appointment  ON complaint.repair_shop_id   = appointment.id " +
            "  where user_name = #{userName}")
    List<ComplaintVO> selectCom(@Param("userName") String userName);
}