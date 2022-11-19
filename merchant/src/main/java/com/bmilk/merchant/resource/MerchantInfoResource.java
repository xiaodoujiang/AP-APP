package com.bmilk.merchant.resource;

import com.bmilk.common.domain.Result;
import com.bmilk.common.dto.MerchantInfoDTO;
import com.bmilk.common.dto.ResultDTO;
import com.bmilk.merchant.dto.MerchantRegistryRequestDTO;
import com.bmilk.merchant.service.MerchantInfoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Slf4j
@RestController
@RequestMapping("/merchant")
public class MerchantInfoResource {
    @Autowired
    private MerchantInfoService merchantInfoService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/info")
    public ResultDTO<MerchantInfoDTO> queryByMerchantNo(
            @RequestParam(value = "merchantNo", required = false) String merchantNo){
        log.info("server port,{}",port);
        log.info("queryByMerchantNo start, merchantNo:[{}]", merchantNo);

        String errMsg = queryByMerchantNoParamCheck(merchantNo);
        if(StringUtils.isNoneBlank(errMsg)){
            ResultDTO<MerchantInfoDTO> resultDTO = new ResultDTO<>(Result.PARMA_ERROR, errMsg, null);
            log.info("queryByMerchantNo param error, merchantNo:[{}], response[{}]", merchantNo, resultDTO);
            return  resultDTO;
        }

        MerchantInfoDTO merchantInfoDTO = merchantInfoService.queryMerchantInfo(merchantNo);

        ResultDTO<MerchantInfoDTO> resultDTO = new ResultDTO<>(Result.SUCCESS, merchantInfoDTO);
        log.info("queryByMerchantNo end, merchantNo:[{}], response:[{}]", resultDTO, resultDTO);
        return resultDTO;
    }


    @PostMapping("/registry")
    public ResultDTO<MerchantInfoDTO> registryMerchant(@RequestBody MerchantRegistryRequestDTO registryRequestDTO){
        //  todo
        return null;
    }


    private String queryByMerchantNoParamCheck(String merchantNo){
        StringBuilder errMsg = new StringBuilder();
        if(StringUtils.isBlank(merchantNo)){
            errMsg.append("商户号不能为空");
        }
        return errMsg.toString();
    }
}
