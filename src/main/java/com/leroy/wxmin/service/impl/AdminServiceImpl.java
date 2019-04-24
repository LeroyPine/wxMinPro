package com.leroy.wxmin.service.impl;

import com.leroy.wxmin.dao.AdminMapper;
import com.leroy.wxmin.model.Admin;
import com.leroy.wxmin.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by leroy on 2019-04-05.
 */
@Service
@Transactional
public class AdminServiceImpl  implements AdminService {
    @Resource
    private AdminMapper adminMapper;
    


}
