package com.togoisperfect.servicemaids.model;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Schema(name = "gleamingnest")
public class AutomatedEmail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emailId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "scheduled_id")
    private ScheduledService scheduledService;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EmailType emailType;

    @Column(name = "sent_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime sentDate = LocalDateTime.now();

    // Getters and setters
}
