package com.spo.core_app.jobs;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component //Springboot will create a object of this class and it will store it in a IOC container
public class SystemJob {

    @Scheduled(fixedDelay = 3000, initialDelay = 1000)
    public void loadAllOperations(){
        System.out.println("Triggered");
    }
}
