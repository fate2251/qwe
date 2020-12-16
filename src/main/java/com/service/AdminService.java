package com.service;

import com.bean.Admin;

public interface AdminService {
    Admin findAdminByAccountAndPwd(Admin admin);
}
