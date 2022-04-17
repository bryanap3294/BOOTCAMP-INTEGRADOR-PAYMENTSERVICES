package com.bootcamp.pagoservicios.service;

import com.bootcamp.pagoservicios.model.ClientServices;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientServicesService {

    Mono<ClientServices> save(ClientServices clientServices);
    Flux<ClientServices> findAll();
    Mono<ClientServices> findAllByDni(String dni);

}
