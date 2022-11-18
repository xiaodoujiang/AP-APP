package com.bmilk.merchant.service;

import com.bmilk.common.dto.MerchantInfoDTO;
import com.bmilk.merchant.dto.MerchantRegistryRequestDTO;

public interface MerchantInfoService {

    /**
     *  根据商户号查询商户信息
     * @param merchantNo
     * @return
     */
    MerchantInfoDTO queryMerchantInfo(String merchantNo);

    /**
     * 商户注册接口
     * @param requestDTO
     * @return
     */
    MerchantInfoDTO registryMerchant(MerchantRegistryRequestDTO requestDTO);

}
