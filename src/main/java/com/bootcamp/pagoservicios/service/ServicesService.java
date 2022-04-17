package com.bootcamp.pagoservicios.service;

import com.bootcamp.pagoservicios.model.Services;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServicesService {

    Mono<Services> save(Services services);
    Flux<Services> findAll();

}
