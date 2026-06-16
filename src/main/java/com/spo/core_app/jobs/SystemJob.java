package com.spo.core_app.jobs;

import com.spo.core_app.models.Operation;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component //Springboot will create a object of this class and it will store it in a IOC container
public class SystemJob {

    public List<Operation> getAllSystemOperations() {
        List<Operation> operations = List.of(
                Operation.builder().id("101").operationName("Source_Strategy_Definition").operationCategory("Sourcing").build(),
                Operation.builder().id("102").operationName("Category_Management").operationCategory("Sourcing").build(),
                Operation.builder().id("103").operationName("Market_Intelligence").operationCategory("Sourcing").build(),
                Operation.builder().id("104").operationName("Supplier_Identification").operationCategory("Supplier_Management").build(),
                Operation.builder().id("105").operationName("Supplier_Qualification").operationCategory("Supplier_Management").build(),
                Operation.builder().id("106").operationName("Supplier_Onboarding").operationCategory("Supplier_Management").build(),
                Operation.builder().id("107").operationName("Request_For_Information_RF1").operationCategory("Sourcing").build(),
                Operation.builder().id("108").operationName("Request_For_Proposal_RFP").operationCategory("Sourcing").build(),
                Operation.builder().id("109").operationName("Request_For_Quotation_RFQ").operationCategory("Sourcing").build(),
                Operation.builder().id("110").operationName("Bid_Management_And_Evaluation").operationCategory("Sourcing").build()
        );
        return operations;
    }

    @Scheduled(fixedDelay = 3000, initialDelay = 1000)
    public void loadAllOperations(){
        List<Operation> operations = this.getAllSystemOperations();
    }
}
