package com.kovtyka.wallet.controller;

import com.kovtyka.wallet.config.PaymentTxService;
import com.kovtyka.wallet.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;
    private final PaymentTxService paymentTxService;

    @PostMapping("/pay")
    void pay(){

    }


}
