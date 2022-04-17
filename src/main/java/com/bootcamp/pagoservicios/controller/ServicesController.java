package com.bootcamp.pagoservicios.controller;

import com.bootcamp.pagoservicios.model.Services;
import com.bootcamp.pagoservicios.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/services")
public class ServicesController {

    @Autowired
    private ServicesService servicesService;

    @PostMapping("/")
    public Mono<Services> save(@RequestBody Services services){
        return servicesService.save(services);
    }

    @GetMapping("/")
    public Flux<Services> findAll(){
        return servicesService.findAll();
    }

}
