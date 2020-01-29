package com.techamist.babucapi.Service.impl;

import com.techamist.babucapi.Entities.BusinessDetails;
import com.techamist.babucapi.Repository.BusinessDetailsRepository;
import com.techamist.babucapi.Service.BusinessDetailsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Service
public class BusinessDetailsServiceImpl implements BusinessDetailsService {
    private static final Logger logger = LogManager.getLogger(BusinessDetailsServiceImpl.class);

    @Autowired
    private BusinessDetailsRepository businessDetailsRepository;

    public ResponseEntity<List<BusinessDetails>> searchBusiness(String date,
                                                String serviceTypeId,
                                                String genderServiceTypeId,
                                                String longitude,
                                                String latitude,
                                                String distance,
                                                String sort){
        try {
            logger.info("Request, date:"+date+", serviceTypeId:"+serviceTypeId+", genderServiceTypeId:"+genderServiceTypeId+", latitude:"+latitude+", longitude:"+longitude+", distance:"+distance+", sort:"+sort);
            List<BusinessDetails> businessDetails;
            int serviceTypeIdInt = (StringUtils.isEmpty(serviceTypeId)) ? 0 : Integer.parseInt(serviceTypeId);
            int genderServiceTypeIdInt = (StringUtils.isEmpty(genderServiceTypeId)) ? 0 : Integer.parseInt(genderServiceTypeId);
            double latitudeDouble = (StringUtils.isEmpty(latitude)) ? 0 : Double.parseDouble(latitude);
            double longitudeDouble = (StringUtils.isEmpty(longitude)) ? 0 : Double.parseDouble(longitude);
            double distanceDouble = StringUtils.isEmpty(distance) ? 0 : Double.parseDouble(distance);
            businessDetails = businessDetailsRepository.searchBusiness(serviceTypeIdInt, genderServiceTypeIdInt, latitudeDouble, longitudeDouble, distanceDouble, sort);
            return new ResponseEntity<>(businessDetails, HttpStatus.OK);
        }
        catch (Exception ex){
            logger.error("Exception : {}", ex.getStackTrace() );
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @ResponseBody
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Object missingParamterHandler(Exception exception) {
        // exception handle while specified arguments are not available requested service only. it handle when request is as api json service
        //return  new HashMap() {{ put("result", "bad_request"); put("type", "request_parameter_missing");}};
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }
}
