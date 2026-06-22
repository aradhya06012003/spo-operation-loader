package com.spo.core_app.models;

import jakarta.persistence.Enumerated;

import java.math.BigDecimal;

public class ProcurementCompany extends Company{

    //Procurement Organization Details
    private String procurementHead;
    private String procurementEmail;
    private String procurementPhone;

    //Financial Controls
    @Enumerated
    private String baseCurrency;
    private BigDecimal annualProcurementBudget;
    private BigDecimal availableBudget;

    //Approval Configuration
    private Boolean approvalRequired;
    private Integer approvalLevels;

    //Purchasing Controls
    private BigDecimal autoApprovalThreshold;
    private BigDecimal rfqRequiredThreshold;
    private BigDecimal rfpRequiredThreshold;

    //Procurement Policies
    private Boolean contractRequired;
    private Boolean threeWayMatchEnabled;
    private Boolean budgetValidationEnabled;

    //ERP Integration
    private String erpSystem;
    private String erpCompanyCode;
    private String costCenterPrefix;

    //Procurement Metrics
    private Integer activeSuppliers;
    private Integer activeContracts;
    private Integer activePurchaseOrders;
    private Integer activePurchaseRequests;
}
