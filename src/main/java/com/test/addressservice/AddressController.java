package com.test.addressservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AddressController {

    @GetMapping("/address")
    public String getAddress() throws InterruptedException {
        Thread.sleep(10000);
        return "default address";
    }
}
