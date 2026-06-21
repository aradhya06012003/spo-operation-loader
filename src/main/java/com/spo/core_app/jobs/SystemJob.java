package com.spo.core_app.jobs;

import com.spo.core_app.constants.SystemConstants;
import com.spo.core_app.models.Operation;
import com.spo.core_app.repositories.OperationRepository;
import com.spo.core_app.utilities.SystemUtility;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Slf4j
@Component //Springboot will create a object of this class and it will store it in a IOC container
public class SystemJob {

    private OperationRepository operationRepository;

    @Autowired
    public SystemJob(OperationRepository operationRepository){
        this.operationRepository = operationRepository;
    }

    public List<Operation> getAllSystemOperations() {
         return List.of(
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
    }

    @Scheduled(fixedDelay = 3000, initialDelay = 1000)
    public void loadAllOperations(){
        List<Operation> operations = this.getAllSystemOperations();
        // In this global record fields are not set
        for(Operation operation : operations){
            SystemUtility.setGlobalRecordProperties(operation,
                    SystemConstants.APPLICATION_USER_NAME,
                    SystemConstants.APPLICATION_USER_NAME,
                    LocalDateTime.now(),
                    LocalDateTime.now());
            //Now we need to save this object in Operation table
            Optional<Operation> opr = operationRepository.findByOperationName(operation.getOperationName());
            if(opr.isEmpty())
            {
                operationRepository.save(operation);
                log.info(String.format("Operation with name %s saved in operations table", operation.getOperationName()));
            }else{
                log.info(String.format("Operation with name%s already exists", operation.getOperationName()));
            }
        }
    }
}
