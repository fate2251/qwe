package com.service;

import com.bean.User;

public interface UserService {
    User selectUserAccount(String account);

    int findUserBytrme(String data2);
}
