package com.leroy.wxmin.service.impl;

import com.leroy.wxmin.dao.ComplaintMapper;
import com.leroy.wxmin.model.Complaint;
import com.leroy.wxmin.service.ComplaintService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by leroy on 2019-03-26.
 */
@Service
@Transactional
public class ComplaintServiceImpl  implements ComplaintService {
    @Resource
    private ComplaintMapper complaintMapper;
    


}
