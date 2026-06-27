package com.spo.core_app.controllers;

import com.spo.core_app.dtos.request.ProcurementCompanyRegistrationDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tools.jackson.databind.ObjectMapper;

import java.awt.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/company")
public class CompanyController {

    @PostMapping(value = "/procurement-company/register", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity registerProcurementCompany(
            @RequestPart String procurementCompanyDetails,
            @RequestPart MultipartFile companyLogo,
            @RequestPart MultipartFile companyRegCertificate
            ){
        //String Json -> ProcurementCompanyRegistrationDto
        ObjectMapper objectMapper = new ObjectMapper();
        ProcurementCompanyRegistrationDto procurementCompanyRegistrationDto = objectMapper.readValue(procurementCompanyDetails, ProcurementCompanyRegistrationDto.class);
    }

}
