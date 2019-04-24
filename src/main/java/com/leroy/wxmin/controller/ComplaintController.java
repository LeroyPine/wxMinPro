package com.leroy.wxmin.controller;
import com.leroy.wxmin.acceptvo.ComplaintVO;
import com.leroy.wxmin.dao.AppointmentMapper;
import com.leroy.wxmin.dao.ComplaintMapper;
import com.leroy.wxmin.dao.RepairShopMapper;
import com.leroy.wxmin.model.Appointment;
import com.leroy.wxmin.model.Complaint;
import com.leroy.wxmin.model.RepairShop;
import com.leroy.wxmin.service.ComplaintService;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import tk.mybatis.mapper.entity.Example;

/**
* Created by leroy on 2019-03-26.
*/
@RestController
@RequestMapping("/complaint")
@Api()
public class ComplaintController {
    @Resource
    private ComplaintService complaintService;
    @Resource
    private ComplaintMapper complaintMapper;
    @Resource
    private RepairShopMapper repairShopMapper;

    @PostMapping("/save")
    public void save(@RequestBody Complaint complaint) {
        complaint.setCreateDate(new Date());
        complaintMapper.insertSelective(complaint);

    }


    @PostMapping("/list")
    public List<ComplaintVO> list(String userName) {

        List<ComplaintVO> complaints = complaintMapper.selectCom(userName);


        return complaints;
    }

}
