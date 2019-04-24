package com.leroy.wxmin.service.impl;

import com.leroy.wxmin.dao.UserInfoMapper;
import com.leroy.wxmin.model.UserInfo;
import com.leroy.wxmin.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by leroy on 2019-03-31.
 */
@Service
@Transactional
public class UserInfoServiceImpl  implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;
    


}
