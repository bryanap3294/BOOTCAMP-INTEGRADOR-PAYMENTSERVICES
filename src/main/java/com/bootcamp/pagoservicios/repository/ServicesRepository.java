package com.bootcamp.pagoservicios.repository;

import com.bootcamp.pagoservicios.model.Services;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepository extends ReactiveMongoRepository<Services, String> {
}
