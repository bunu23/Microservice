package com.bunu.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

@Autowired
AccountFeignClient accountFeignClient;

@GetMapping("account/customerid")
public Account getName(@PathVariable("customerid")String customerId){
    Account account=accountFeignClient.getName(customerId);
    return account;
}

    @FeignClient(name="AccountService")
    interface AccountFeignClient{
        @RequestMapping("account/{customerid}")
        public Account getName(@PathVariable ("customerid")String customerId);
    }


}
