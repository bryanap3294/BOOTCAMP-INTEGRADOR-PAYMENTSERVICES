package com.bootcamp.pagoservicios.controller;

import com.bootcamp.pagoservicios.model.ClientServices;
import com.bootcamp.pagoservicios.service.ClientServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client-services")
public class ClientServicesController {

    @Autowired
    private ClientServicesService clientServicesService;

    @GetMapping("/")
    public Flux<ClientServices> findAll(){
        return clientServicesService.findAll();
    }

    @PostMapping("/")
    public Mono<ClientServices> save(@RequestBody ClientServices clientServices){
        return clientServicesService.save(clientServices);
    }

}
