package com.kosarev.goitspring.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Client {

    private Long id;
    private String name;
    private String greeting;

    public Client(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}


