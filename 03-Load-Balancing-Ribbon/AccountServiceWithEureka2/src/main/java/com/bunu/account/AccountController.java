package com.bunu.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/account/{customerId}")
    public Account getName(@PathVariable("customerid")String customerId){
        return new Account("311","2332.33");
    }


}
