package com.spo.core_app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "operations")
public class Operation extends GlobalRecord {
    private String id;
    @Column(unique = true, nullable = false)
    private String operationName;
    private String operationCategory;
}
