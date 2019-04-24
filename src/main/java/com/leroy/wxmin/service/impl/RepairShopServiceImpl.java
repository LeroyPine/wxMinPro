package com.leroy.wxmin.service.impl;

import com.leroy.wxmin.dao.RepairShopMapper;
import com.leroy.wxmin.model.RepairShop;
import com.leroy.wxmin.service.RepairShopService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by leroy on 2019-03-26.
 */
@Service
@Transactional
public class RepairShopServiceImpl  implements RepairShopService {
    @Resource
    private RepairShopMapper repairShopMapper;


    @Override
    public List<RepairShop> findShopList() {
        List<RepairShop> repairShops = repairShopMapper.selectShopList();
        return repairShops;
    }

    @Override
    public RepairShop selectDetail(Integer shopId) {
        RepairShop repairShop = new RepairShop();
        repairShop.setId(shopId);
        return repairShopMapper.selectByPrimaryKey(shopId);
    }
}
