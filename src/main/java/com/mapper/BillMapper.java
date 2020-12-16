package com.mapper;

import org.apache.ibatis.annotations.Param;

public interface BillMapper {
    Double findBillSumMoneyBytimeAndStatus(@Param("data2") String data2, @Param("i") int i);
}
