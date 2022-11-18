package com.bmilk.common.dto;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class SignInfoDTO implements Serializable {

    /**
     * 商户号
     */
    private String merchantNo;

    /**
     * 签约渠道，即支付时使用的渠道
     */
    private String paymentChannel;

    /**
     * 该渠道支付最小金额
     */
    private BigDecimal minAmount;

    /**
     * 该渠道支付最大金额
     */
    private BigDecimal maxAmount;

    /**
     * 是否可用，避免静默期不可用
     */
    private String isValid;
}
