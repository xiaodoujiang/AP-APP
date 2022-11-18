package com.bmilk.merchant.service.impl;

import com.bmilk.common.dto.MerchantInfoDTO;
import com.bmilk.common.exception.NotFundException;
import com.bmilk.merchant.dao.MerchantInfoDao;
import com.bmilk.merchant.dto.MerchantRegistryRequestDTO;
import com.bmilk.merchant.entry.MerchantInfo;
import com.bmilk.merchant.service.MerchantInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MerchantInfoServiceImpl implements MerchantInfoService {

    @Autowired
    private MerchantInfoDao merchantInfoDao;

    public MerchantInfoDTO queryMerchantInfo(String merchantNo){
        log.info("query merchant info start, merchantNo:[{}]",merchantNo);

        MerchantInfo merchantInfo = merchantInfoDao.queryByMerchantNo(merchantNo);
        if(null == merchantInfo || null == merchantInfo.getId()){
            throw new NotFundException(String.format("can not fund merchant by giving merchant no, merchantNo:[%s]", merchantNo));
        }
        return buildMerchantInfoDTO(merchantInfo);
    }

    @Override
    public MerchantInfoDTO registryMerchant(MerchantRegistryRequestDTO requestDTO) {
         return null;
    }


    private MerchantInfoDTO buildMerchantInfoDTO(MerchantInfo merchantInfo){
        MerchantInfoDTO dto = new MerchantInfoDTO();
        dto.setMerchantNo(merchantInfo.getMerchantNo());
        dto.setIsRealName(merchantInfo.getIsRealName());
        dto.setIsValid(merchantInfo.getIsValid());
        dto.setRegistryTime(merchantInfo.getRegistryTime());
        return dto;
    }


}
