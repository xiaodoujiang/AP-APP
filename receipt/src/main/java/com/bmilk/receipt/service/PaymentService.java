package com.bmilk.receipt.service;

import com.bmilk.receipt.entry.RecPaymentOrder;

public interface PaymentService {


    public void record();

    public RecPaymentOrder getOrder(long id);
}
