package com.kosarev.goitspring.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Client {

    @Value("${id}")
    private Long id;

    @Value("${name}")
    private String name;

    @Value("${greeting}")
    private String greeting;

}


