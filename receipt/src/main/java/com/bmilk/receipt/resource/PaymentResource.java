package com.bmilk.receipt.resource;

import com.bmilk.common.domain.Result;
import com.bmilk.common.dto.ResultDTO;
import com.bmilk.receipt.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/payment")
public class PaymentResource {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/prepare")
    public ResultDTO<String> record(){
        paymentService.record();
        return new ResultDTO<>(Result.SUCCESS, "success");
    }

}
