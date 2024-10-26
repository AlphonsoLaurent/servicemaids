package com.servicemaids.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "service_address", schema = "gleamingnest")
public class ServiceAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(nullable = false)
    private String address;

    private String aptSuite;
    private String city;
    private String state;
    private String postalCode;

    // Getters and setters
}

