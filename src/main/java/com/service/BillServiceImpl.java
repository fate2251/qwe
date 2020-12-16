package com.service;

import com.mapper.BillMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class BillServiceImpl implements BillService{
    @Resource
    BillMapper billMapper;

    @Override
    public Double findBillSumMoneyBytimeAndStatus(String data2, int i) {
        return billMapper.findBillSumMoneyBytimeAndStatus(data2,i);
    }
}
