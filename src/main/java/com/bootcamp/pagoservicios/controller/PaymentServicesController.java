package com.bootcamp.pagoservicios.controller;

import com.bootcamp.pagoservicios.model.PaymentServices;
import com.bootcamp.pagoservicios.service.PaymentServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/payment-services")
public class PaymentServicesController {

    @Autowired
    private PaymentServicesService paymentServicesService;

    @GetMapping("/")
    public Flux<PaymentServices> findAll(){
        return paymentServicesService.findAll();
    }

    @PostMapping("/")
    public Mono<PaymentServices> save(@RequestBody PaymentServices paymentServices){
        return paymentServicesService.save(paymentServices);
    }

}
