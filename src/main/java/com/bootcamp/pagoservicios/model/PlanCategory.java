package com.bootcamp.pagoservicios.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(value="planCategory")
public class PlanCategory {

    private String serviceCode;
    private String planCategory;
    private BigDecimal amount;

}
