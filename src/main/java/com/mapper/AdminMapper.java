package com.mapper;

import com.bean.Admin;

public interface AdminMapper {
    Admin findAdminByAccountAndPwd(Admin admin);
}
