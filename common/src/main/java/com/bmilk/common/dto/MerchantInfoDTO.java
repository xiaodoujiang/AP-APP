package com.bmilk.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class MerchantInfoDTO implements Serializable {

    /**
     * 商户号
     */
    private String merchantNo;

    /**
     * 注册时间
     */
    private Date registryTime;
    /**
     * 签约信息
     */
    private List<SignInfoDTO> signInfoDTOList;

    /**
     * 是否实名
     */
    private String isRealName;
    /**
     * 是否可用
     */
    private String isValid;
    /**
     * 备注
     */
    private String remark;
}
