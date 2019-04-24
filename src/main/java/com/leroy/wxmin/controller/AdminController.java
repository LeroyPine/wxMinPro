package com.leroy.wxmin.controller;
import com.leroy.wxmin.dao.AdminMapper;
import com.leroy.wxmin.model.Admin;
import com.leroy.wxmin.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import javax.annotation.Resource;
import java.util.List;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import tk.mybatis.mapper.entity.Example;

/**
* Created by leroy on 2019-04-05.
*/
@RequestMapping("/admin")
@Controller
@Api()
public class AdminController {
    @Resource
    private AdminService adminService;
    @Resource
    private AdminMapper adminMapper;

    @PostMapping("/login")
    public String save(Admin admin, Model model) {
       if (admin != null){
           Example example = new Example(Admin.class);
           Example.Criteria criteria = example.createCriteria();
           criteria.andEqualTo("adminname",admin.getAdminname());
           criteria.andEqualTo("pwd",admin.getPwd());
           List<Admin> admins = adminMapper.selectByExample(example);
           if (admins != null && admins.size() > 0){
               model.addAttribute("name",admins.get(0).getAdminname());
               return "mainTeacher";
           }else {
               model.addAttribute("error","用户名或者密码错误");
           }
       }
       return "login";
    }




}
