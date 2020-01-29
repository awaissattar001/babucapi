package com.techamist.babucapi.Service;

import com.techamist.babucapi.Entities.BusinessDetails;
import org.springframework.http.ResponseEntity;
import java.util.List;

public interface BusinessDetailsService {
    ResponseEntity<List<BusinessDetails>> searchBusiness(String date,
                                                                String serviceTypeId,
                                                                String genderServiceTypeId,
                                                                String  longitude,
                                                                String  latitude,
                                                                String distance,
                                                                String sort);
}
