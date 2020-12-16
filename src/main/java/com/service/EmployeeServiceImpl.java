package com.service;

import com.bean.Employee;
import com.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
    @Resource
    EmployeeMapper employeeMapper;
    @Override
    public List<Employee> findEmpAll() {
        return employeeMapper.findEmpAll();
    }
}
