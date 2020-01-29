package com.techamist.babucapi.Entities;

import javax.persistence.*;

@Entity
@Table(name = "service_for_gender")
public class ServiceForGender {
    @Id
    @Column(name = "service_gender_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int serviceGenderId;
    @Column(name = "gender_type", nullable = false)
    private String genderType;
    @Column(name = "service_type_id", nullable = false)
    private int serviceTypeId;

    public ServiceForGender() {
    }

    public ServiceForGender(String genderType, int serviceTypeId) {
        this.genderType = genderType;
        this.serviceTypeId = serviceTypeId;
    }

    public int getServiceGenderId() {
        return serviceGenderId;
    }

    public void setServiceGenderId(int serviceGenderId) {
        this.serviceGenderId = serviceGenderId;
    }

    public String getGenderType() {
        return genderType;
    }

    public void setGenderType(String genderType) {
        this.genderType = genderType;
    }

    public int getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(int serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }
}
