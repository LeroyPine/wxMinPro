package com.leroy.wxmin.service.impl;

import com.leroy.wxmin.dao.AppointmentMapper;
import com.leroy.wxmin.model.Appointment;
import com.leroy.wxmin.service.AppointmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by leroy on 2019-03-26.
 */
@Service
@Transactional
public class AppointmentServiceImpl  implements AppointmentService {
    @Resource
    private AppointmentMapper appointmentMapper;
    


}
