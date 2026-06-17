package com.spo.core_app.utilities;

import com.spo.core_app.models.GlobalRecord;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SystemUtility {

    public static void setGlobalRecordProperties(GlobalRecord globalRecord,
                                                 String createdBy,
                                                 String updatedBy,
                                                 LocalDateTime createdAt,
                                                 LocalDateTime updatedAt){
            globalRecord.setCreatedAt(createdAt);
            globalRecord.setUpdatedAt(updatedAt);
            globalRecord.setCreatedBy(createdBy);
            globalRecord.setUpdatedBy(updatedBy);
    }
}
