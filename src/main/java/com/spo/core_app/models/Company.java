package com.spo.core_app.models;

import com.spo.core_app.ennums.CompanyStatus;
import com.spo.core_app.ennums.CompanyType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "companies")
public class Company extends GlobalRecord{

    private String companyId;
    private String legalName;
    private String displayName;
    @Enumerated
    private CompanyType companyType;
    @Enumerated
    private CompanyStatus companyStatus;
    private String taxID;
    private String taxRegNumber;
    private String govRegNumber;
    private String primaryContactNumber;
    private String contactName;
    private String contactEmail;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String country;
}
