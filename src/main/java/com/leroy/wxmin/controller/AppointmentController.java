package com.leroy.wxmin.controller;

import com.leroy.wxmin.acceptvo.AppointmentVO;
import com.leroy.wxmin.dao.AppointmentMapper;
import com.leroy.wxmin.dao.ComplaintMapper;
import com.leroy.wxmin.model.Appointment;
import com.leroy.wxmin.model.Complaint;
import com.leroy.wxmin.service.AppointmentService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by leroy on 2019-03-26.
 */
@Controller
@RequestMapping("/appointment")
@Api()
public class AppointmentController extends SimpleMappingExceptionResolver {
    @Resource
    private AppointmentService appointmentService;
    @Resource
    private AppointmentMapper appointmentMapper;
    @Resource
    private ComplaintMapper complaintMapper;


    @PostMapping("/add")
    @ResponseBody
    public String save(@RequestBody AppointmentVO appointmentVO, HttpServletRequest request, HttpServletResponse response) {
        Appointment appointment = appointmentVO.generator();
        appointment.setState("10");   //10 审核中    15  预约成功    20 预约失败
        appointmentMapper.insert(appointment);
        return null;
    }


    @PostMapping("/list")
    @ResponseBody
    public List<AppointmentVO> list(String userName) {
        List<AppointmentVO> appointments = appointmentMapper.selectByuserName(userName);
        return appointments;
    }

    @GetMapping("/listForAdmin")
    public String  list(Model model) {
        List<AppointmentVO> appointments = appointmentMapper.selectForAdmin();
        model.addAttribute("appointmentData",appointments);
        return "content";
    }


    @GetMapping("/updateState")
    @ResponseBody
    public String updateState(Integer state,Integer appointId){
        Appointment appointment = new Appointment();
        appointment.setId(appointId);
        if (1 == state ){
            appointment.setState("15");
            appointmentMapper.updateByPrimaryKeySelective(appointment);
            return "suc";
        }else {
            appointment.setState("20");
            appointmentMapper.updateByPrimaryKeySelective(appointment);
        }
        return "fail";
    }


    @PostMapping("/del")
    @ResponseBody
    public void del(Integer id){
        Appointment appointment = new Appointment();
        appointment.setId(id);
        appointmentMapper.deleteByPrimaryKey(appointment);
        Example example = new Example(Complaint.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("repairShopId",id);
        complaintMapper.deleteByExample(example);
    }

}
