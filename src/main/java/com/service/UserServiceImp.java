package com.service;

import com.bean.User;
import com.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImp implements UserService {
    @Resource
    private UserMapper dao;
    @Override
    public User selectUserAccount(String account) {
        return dao.selectUserAccount(account);
    }

    @Override
    public int findUserBytrme(String data2) {
        return dao.findUserBytrme(data2);
    }
}
