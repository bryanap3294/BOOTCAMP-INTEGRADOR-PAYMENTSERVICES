package com.bootcamp.pagoservicios.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(value="paymentServices")
public class PaymentServices {

    @Id
    private String id;
    private String supplyCode;
    private String serviceCode;
    private String amount;
    private String transactionDate;

}
