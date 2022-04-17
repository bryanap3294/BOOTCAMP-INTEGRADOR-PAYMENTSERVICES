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
@Document(value="channels")
public class Channel {

    @Id
    private String channelCode;
    private String description;
    private Boolean isActive;

}
