package com.techamist.babucapi.Repository;

import com.techamist.babucapi.Entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BusinessDetailsRepository extends JpaRepository<BusinessDetails, Long> {
    //@Query("select a from BusinessDetails a join Services s on a.businessId = s.businessId where s.serviceGenderId = ?1")
//    @Query("select a from BusinessDetails a, Services s, ServiceForGender sg " +
//            "where a.businessId = s.businessId and s.serviceGenderId = sg.serviceGenderId and (?1 = 0 or sg.serviceTypeId = ?1) and (?2 = 0 or s.serviceGenderId = ?2) " +
//            "and ( (?3 <= 0.0 or ?4 <= 0.0 or ?5 <= 0.0) or (6371 * acos(cos(radians(?3) ) * cos(radians(a.latitude)) * cos(radians(a.longitude) - radians(?4) ) + sin(radians(?3)) * sin(radians(a.latitude) ) ) ) < ?5 )")
//    List<BusinessDetails> searchBusiness(int serviceTypeId, int genderServiceId, double latitude, double longitude, double distance);
    @Query("select a from BusinessDetails a, Services s, ServiceForGender sg " +
            "where a.businessId = s.businessDetails.businessId and s.serviceGenderId = sg.serviceGenderId and (?1 = 0 or sg.serviceTypeId = ?1) and (?2 = 0 or s.serviceGenderId = ?2) " +
            "and ((?3 <= 0.0 or ?4 <= 0.0 or ?5 <= 0.0) or ( (6371 * acos(cos(radians(?3) ) * cos(radians(a.latitude)) * cos(radians(a.longitude) - radians(?4) ) + sin(radians(?3)) * sin(radians(a.latitude) ) ) ) < ?5 ))" +
            "order by case when (?3 > 0.0 and ?4 > 0.0 and ?5 > 0.0 and ?6 = 'distance') then (6371 * acos(cos(radians(?3) ) * cos(radians(a.latitude)) * cos(radians(a.longitude) - radians(?4) ) + sin(radians(?3)) * sin(radians(a.latitude) ) ) ) end asc" +
            ", case when ?6 = 'Price' then s.serviceCost end asc")
    List<BusinessDetails> searchBusiness(int serviceTypeId, int genderServiceId, double latitude, double longitude, double distance, String sort);
}
