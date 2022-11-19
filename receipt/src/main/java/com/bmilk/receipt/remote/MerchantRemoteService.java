package com.bmilk.receipt.remote;

import com.bmilk.common.domain.Result;
import com.bmilk.common.dto.MerchantInfoDTO;
import com.bmilk.common.dto.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MerchantRemoteService  {

    private static final String MERCHANT_APP_REMOTE_ADDRESS = "http://merchant";
    @Autowired
    private RestTemplate restTemplate;

    public MerchantInfoDTO queryMerchantInfo(String merchantNo){
        
        String url = MERCHANT_APP_REMOTE_ADDRESS + "/merchant/info?merchantNo=" + merchantNo;
        ResultDTO<MerchantInfoDTO> resultDTO = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<ResultDTO<MerchantInfoDTO>>() {
        }).getBody();
        if(null != resultDTO && Result.SUCCESS.getCode().equals(resultDTO.getRestCode())){
            return resultDTO.getData();
        }
        throw new RuntimeException("query merchant info failure");
    }
}
