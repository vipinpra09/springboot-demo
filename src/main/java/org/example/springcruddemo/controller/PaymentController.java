package org.example.springcruddemo.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@RequestMapping("/api")
public class PaymentController {
    @GetMapping("/payment")
    public String payment(){
        return "payment service called";
    }
}
