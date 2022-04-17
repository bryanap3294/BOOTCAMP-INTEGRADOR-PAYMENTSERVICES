package com.bootcamp.pagoservicios.repository;

import com.bootcamp.pagoservicios.model.ClientServices;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientServicesRepository extends ReactiveMongoRepository<ClientServices, String> {
}
