package com.bmilk.receipt.remote;

import com.bmilk.common.domain.Result;
import com.bmilk.common.dto.MerchantInfoDTO;
import com.bmilk.common.dto.ResultDTO;
import com.bmilk.receipt.remote.feign.MerchantFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MerchantRemoteService  {

    @Autowired
    private MerchantFeignService merchantFeignService;

    public MerchantInfoDTO queryMerchantInfo(String merchantNo){
        
        ResultDTO<MerchantInfoDTO> resultDTO = merchantFeignService.queryMerchantInfo(merchantNo);
        if(null != resultDTO && Result.SUCCESS.getCode().equals(resultDTO.getRestCode())){
            return resultDTO.getData();
        }
        throw new RuntimeException("query merchant info failure");
    }
}
