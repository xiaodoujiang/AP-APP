package com.bmilk.merchant.entry;

import lombok.Data;

import java.util.Date;

/**
 * 商户信息表
 * merchant_info
 */
@Data
public class MerchantInfo extends BaseEntry{

    /**
     * 幂等表Id
     */
    private String idemId;

    /**
     * 商户号
     */
    private String merchantNo;

    /**
     * 商户注册手机号
     */
    private String mobileNo;

    /**
     * 是否可用
     */
    private String isValid;

    /**
     * 是否已经实名
     */
    private String isRealName;

    /**
     * 注册时间
     */
    private Date registryTime;

    /**
     * 备注
     */
    private String remark;
}
