package com.bmilk.receipt.remote.feign;

import com.bmilk.common.dto.MerchantInfoDTO;
import com.bmilk.common.dto.ResultDTO;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "merchant")
public interface MerchantFeignService {

    @GetMapping(value = "/merchant/info")
    ResultDTO<MerchantInfoDTO>  queryMerchantInfo(@Param("merchantNo") String merchantNo);
}
