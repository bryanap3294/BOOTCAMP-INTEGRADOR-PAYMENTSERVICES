package com.bootcamp.pagoservicios.service.impl;

import com.bootcamp.pagoservicios.model.Services;
import com.bootcamp.pagoservicios.repository.ServicesRepository;
import com.bootcamp.pagoservicios.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServicesServiceImpl implements ServicesService {

    @Autowired
    private ServicesRepository servicesRepository;

    @Override
    public Mono<Services> save(Services services) {
        return servicesRepository.save(services);
    }

    @Override
    public Flux<Services> findAll() {
        return servicesRepository.findAll();
    }
}
