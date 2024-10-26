package com.servicemaids.model;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Schema(name = "gleamingnest")
public class ExtraServiceDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detailId;

    @ManyToOne
    @JoinColumn(name = "scheduled_id", nullable = false)
    private ScheduledService scheduledService;

    @ManyToOne
    @JoinColumn(name = "extra_id", nullable = false)
    private ExtraServiceCatalog extraService;

    // Getters and setters
}

