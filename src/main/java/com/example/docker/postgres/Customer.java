package com.example.docker.postgres;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    private Long customerId;
    private String customerName;

}
