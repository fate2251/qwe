package com.service;

import com.bean.Admin;
import com.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
    @Resource
    AdminMapper adminMapper;
    @Override
    public Admin findAdminByAccountAndPwd(Admin admin) {
        return adminMapper.findAdminByAccountAndPwd(admin);
    }
}
