package com.bmilk.receipt.remote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MerchantRemoteService  {
    @Autowired
    private RestTemplate restTemplate;
}
