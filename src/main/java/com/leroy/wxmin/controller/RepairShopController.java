package com.leroy.wxmin.controller;
import com.leroy.wxmin.FileUtil;
import com.leroy.wxmin.acceptvo.RepairShopVO;
import com.leroy.wxmin.dao.RepairShopMapper;
import com.leroy.wxmin.model.RepairShop;
import com.leroy.wxmin.service.RepairShopService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;



import io.swagger.annotations.Api;
import org.springframework.web.multipart.MultipartFile;

/**
* Created by leroy on 2019-03-26.
*/
@Controller
@RequestMapping("/repair/shop")
@Api(tags = "repair")
public class RepairShopController {
    @Resource
    private RepairShopService repairShopService;
    @Resource
    private RepairShopMapper repairShopMapper;


    //上传真实地址
    @Value("${file.uploadFolder}")
    private  String uploadFolder;
    //映射地址
    @Value("${file.url}")
    private  String url;


    @Value("${wpost}")
    private  String wpost;

    @PostMapping("/list")
    @ResponseBody
    public List<RepairShop> repairShopList() {
       return repairShopService.findShopList();
    }

    @PostMapping("/detail")
    @ResponseBody
    public RepairShop repairShopDetail(Integer shopId) {
        return repairShopService.selectDetail(shopId);
    }

    @GetMapping("/listForadmin")
    public String list(Model model){
        List<RepairShopVO>  repairShopVOList  =  repairShopMapper.selectShop();
        model.addAttribute("repairShopList",repairShopVOList);
        return "repairShopList";
    }


    @ResponseBody
    @PostMapping("/upload")
    public  String saveImg(MultipartFile fileData, HttpServletRequest request) throws Exception {

        String ip = "localhost";
        String qurl = FileUtil.getUrl(ip, wpost, url);
        try {
            String fileUrl = FileUtil.uploadFile(uploadFolder, fileData);
            String msg = "{\"success\":\"" + true + "\",\"file_path\":\"" + qurl+fileUrl + "\"}";
            return msg;
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"fail\": \"\"}";
        }
    }


    @PostMapping("/add")
    public String add(RepairShop repairShop){
        repairShop.setBrowserNum(100);
        repairShopMapper.insertSelective(repairShop);
        return "redirect:/repair/shop/listForadmin";
    }

    @GetMapping("/findRepairById")
    public String findRepairById(Integer id,Model model){
        RepairShop repairShop = new RepairShop();
        repairShop.setId(id);
        repairShop = repairShopMapper.selectByPrimaryKey(repairShop);
        model.addAttribute("repairShop",repairShop);
        return "updateRepair";
    }


    @GetMapping("/update")
    public String updateRepairShop(RepairShop repairShop){
        repairShop.setBrowserNum(200);
        repairShopMapper.updateByPrimaryKey(repairShop);
        return "redirect:/repair/shop/listForadmin";
    }

    @GetMapping("/delete")
    public String delete(Integer id){
        RepairShop repairShop = new RepairShop();
        repairShop.setId(id);
        repairShopMapper.deleteByPrimaryKey(repairShop);
        return "redirect:/repair/shop/listForadmin";
    }


}
