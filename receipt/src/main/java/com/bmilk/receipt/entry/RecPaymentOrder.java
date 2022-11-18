package com.bmilk.receipt.entry;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付订单表
 * rec_payment_order
 */
@Data
public class RecPaymentOrder extends BaseEntry{

    /**
     * 幂等表Id
     */
    private Long idemId;

    /**
     * 交易金额
     */
    private BigDecimal transactionAmount;

    /**
     * 交易时间
     */
    private Date transactionDate;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 成功金额
     */
    private BigDecimal successAmount;

    /**
     * 流水号
     */
    private String requestNo;

    /**
     * 下一次重试事件，防止数据积压
     */
    private Date nextRetryTime;

    /**
     * 商户号
     */
    private String merchantNo;

    /**
     * 订单完成时间
     */
    private Date finishTime;

    /**
     * 支付账户
     */
    private String payAccountNo;

    /**
     * 支付渠道
     */
    private String paymentChannel;

}
