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
@Document(value="clientServices")
public class ClientServices {

    @Id
    private String supplyCode;
    private String serviceCode;
    private String planCategory;
    private String dni;
    private String name;
    private String lastName;

}
