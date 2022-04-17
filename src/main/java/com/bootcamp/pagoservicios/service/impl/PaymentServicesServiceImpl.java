package com.bootcamp.pagoservicios.service.impl;

import com.bootcamp.pagoservicios.model.PaymentServices;
import com.bootcamp.pagoservicios.repository.PaymentServicesRepository;
import com.bootcamp.pagoservicios.service.PaymentServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PaymentServicesServiceImpl implements PaymentServicesService {

    @Autowired
    private PaymentServicesRepository paymentServicesRepository;

    @Override
    public Mono<PaymentServices> save(PaymentServices paymentServices) {
        return paymentServicesRepository.save(paymentServices);
    }

    @Override
    public Flux<PaymentServices> findAll() {
        return paymentServicesRepository.findAll();
    }
}
