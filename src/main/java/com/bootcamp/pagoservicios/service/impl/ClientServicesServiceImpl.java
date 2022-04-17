package com.bootcamp.pagoservicios.service.impl;

import com.bootcamp.pagoservicios.model.ClientServices;
import com.bootcamp.pagoservicios.repository.ClientServicesRepository;
import com.bootcamp.pagoservicios.service.ClientServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServicesServiceImpl implements ClientServicesService {

    @Autowired
    private ClientServicesRepository clientServicesRepository;

    @Override
    public Mono<ClientServices> save(ClientServices clientServices) {
        return clientServicesRepository.save(clientServices);
    }

    @Override
    public Flux<ClientServices> findAll() {
        return clientServicesRepository.findAll();
    }

    @Override
    public Mono<ClientServices> findAllByDni(String dni) {
        return null;
    }
}
