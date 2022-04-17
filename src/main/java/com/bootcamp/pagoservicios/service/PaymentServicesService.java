package com.bootcamp.pagoservicios.service;

import com.bootcamp.pagoservicios.model.PaymentServices;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PaymentServicesService {

    Mono<PaymentServices> save(PaymentServices paymentServices);
    Flux<PaymentServices> findAll();

}
