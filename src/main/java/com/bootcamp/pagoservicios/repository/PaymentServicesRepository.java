package com.bootcamp.pagoservicios.repository;

import com.bootcamp.pagoservicios.model.PaymentServices;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentServicesRepository extends ReactiveMongoRepository<PaymentServices, String> {
}
