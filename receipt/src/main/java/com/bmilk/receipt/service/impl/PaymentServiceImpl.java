package com.bmilk.receipt.service.impl;

import com.bmilk.common.domain.OrderStatus;
import com.bmilk.common.domain.PaymentChannel;
import com.bmilk.receipt.dao.RecPaymentOrderDao;
import com.bmilk.receipt.entry.RecPaymentOrder;
import com.bmilk.receipt.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;


@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private RecPaymentOrderDao recPaymentOrderDao;


    @Override
    public void record() {

        RecPaymentOrder order  = new RecPaymentOrder();

        order.setOrderStatus(OrderStatus.NEW.name());
        order.setIdemId(1L);
        order.setPaymentChannel(PaymentChannel.ALI_PAY.name());
        order.setMerchantNo("111");
        order.setRequestNo("111");
        order.setNextRetryTime(new Date());
        order.setTransactionAmount(new BigDecimal(200));
        order.setTransactionDate(new Date());
        order.setPayAccountNo("123");
        recPaymentOrderDao.insert(order);
    }

    @Override
    public RecPaymentOrder getOrder(long id) {
        RecPaymentOrder recPaymentOrder = recPaymentOrderDao.queryById(id);
        return  recPaymentOrder;
    }
}
