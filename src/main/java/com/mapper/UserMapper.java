package com.mapper;

import com.bean.User;

public interface UserMapper {
    User selectUserAccount(String account);

    int findUserBytrme(String data2);
}
