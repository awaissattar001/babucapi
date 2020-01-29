package com.techamist.babucapi.Repository;

import com.techamist.babucapi.Entities.BusinessDetails;
import com.techamist.babucapi.Entities.ServiceHours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceHoursRepository extends JpaRepository<ServiceHours, Long> {

}
