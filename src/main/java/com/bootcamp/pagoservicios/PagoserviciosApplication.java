package com.bootcamp.pagoservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class PagoserviciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagoserviciosApplication.class, args);
	}

}
