package com.bmilk.receipt.dao;

import com.bmilk.receipt.entry.RecPaymentOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * rec_payment_order表
 */
@Mapper
public interface RecPaymentOrderDao {

    int insert(RecPaymentOrder recPaymentOrder);

    RecPaymentOrder queryById(@Param("id") long id);
}
