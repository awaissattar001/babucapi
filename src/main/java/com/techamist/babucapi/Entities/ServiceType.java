package com.techamist.babucapi.Entities;

import javax.persistence.*;

@Entity
@Table(name = "service_type")
public class ServiceType {
    @Id
    @Column(name = "service_type_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int serviceTypeId;
    @Column(name = "service_type", nullable = false)
    private String serviceType;

    public ServiceType() {
    }

    public ServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public int getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(int serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
