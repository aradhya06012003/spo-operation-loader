package com.spo.core_app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@Table(name = "operations")
public class Operation extends GlobalRecord {
    private String id;
    @Column(unique = true, nullable = false)
    private String operationName;
    private String operationCategory;
}
