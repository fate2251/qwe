package com.service;

import com.mapper.CardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class CardServiceImpl implements CardService{
    @Resource
    private CardMapper cardMapper;

    @Override
    public int findCardBytrme(String data2) {
        return cardMapper.findCardBytrme(data2);
    }
}
