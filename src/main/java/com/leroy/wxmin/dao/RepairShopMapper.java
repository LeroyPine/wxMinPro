package com.leroy.wxmin.dao;

import com.leroy.wxmin.acceptvo.RepairShopVO;
import com.leroy.wxmin.model.RepairShop;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RepairShopMapper extends Mapper<RepairShop> {

    @Select("select id,photo,name,description,address,browser_num browserNum from repair_shop order by browser_num desc")
    List<RepairShop> selectShopList();


    @Select("select id,photo,name,description,address,browser_num browerNum from repair_shop order by browser_num desc")
    List<RepairShopVO> selectShop();

}