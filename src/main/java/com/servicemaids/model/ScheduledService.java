package com.servicemaids.model;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@Entity
@Schema(name = "gleamingnest")
public class ScheduledService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduledId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    private ServiceCatalog service;

    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private ServiceAddress address;

    @Column(nullable = false)
    private LocalDate serviceDate;

    @Column(nullable = false)
    private LocalTime serviceTime;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ServiceFrequency frequency;

    private String additionalInstructions;

    @ManyToOne
    @JoinColumn(name = "discount_id")
    private Discount discount;

    private double tip;

    // Getters and setters
}

