package com.leroy.wxmin.service;
import com.leroy.wxmin.model.RepairShop;

import java.util.List;


/**
 * Created by leroy on 2019-03-26.
 */
public interface RepairShopService  {

    List<RepairShop> findShopList();


    RepairShop selectDetail(Integer shopId);
}
