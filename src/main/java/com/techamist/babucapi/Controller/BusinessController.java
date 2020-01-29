package com.techamist.babucapi.Controller;

import com.techamist.babucapi.Entities.BusinessDetails;
import com.techamist.babucapi.Entities.ServiceHours;
import com.techamist.babucapi.Repository.ServiceHoursRepository;
import com.techamist.babucapi.Service.BusinessDetailsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.techamist.babucapi.Model.*;

import java.util.List;

@RestController
public class BusinessController {
    private static final Logger logger = LogManager.getLogger(BusinessController.class);

    @Autowired
    private BusinessDetailsService businessDetailsService;

    @Autowired
    private ServiceHoursRepository serviceHoursRepository;

    private static final String template = "Hello, %s!";

    @GetMapping("/business")
    public BusinessDetailsDTO getBusiness(){
        return new BusinessDetailsDTO();
    }
    //@DateTimeFormat(pattern = "yyyy-mm-dd")@RequestParam(value = "date") Date date,
    @GetMapping("/allBusiness")
    public ResponseEntity<List<BusinessDetails>> getAllBusiness(
            @RequestParam(value = "date") String date,
            @RequestParam(value = "serviceTypeId") String serviceTypeId,
            @RequestParam(value = "genderServiceTypeId") String genderServiceTypeId,
            @RequestParam(value = "longitude") String  longitude,
            @RequestParam(value = "latitude") String  latitude,
            @RequestParam(value = "distance") String distance,
            @RequestParam(value = "sort") String sort){
        return businessDetailsService.searchBusiness(date,serviceTypeId, genderServiceTypeId, longitude, latitude, distance, sort);
    }

    @GetMapping("/allServiceHours")
    public ResponseEntity<List<ServiceHours>> getAllServiceHours(){
        return new ResponseEntity<>(serviceHoursRepository.findAll(), HttpStatus.OK);
    }
}
