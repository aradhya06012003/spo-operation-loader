package com.spo.core_app.models;

import com.spo.core_app.ennums.EmploymentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor

public class Employee extends GlobalRecord{

    @Column(unique = true, nullable = false)
    private String employeeId;

    private String designation;

    private String department;

    private String costCenter;

    private String businessUnit;

    @Enumerated
    private EmploymentType employmentType;

    @ManyToOne
    private Employee manager;

    private BigDecimal approvalLimit;

    private Boolean procurementApprover;

    private Boolean financeApprover;
}
