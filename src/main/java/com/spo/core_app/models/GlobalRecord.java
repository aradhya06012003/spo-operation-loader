package com.spo.core_app.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "global_records")
@Inheritance(strategy = InheritanceType.JOINED)
public class GlobalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID sysId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
}