package com.techamist.babucapi.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "services")
public class Services {
    @Id
    @Column(name = "service_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int serviceId;
    @Column(name = "service_name", nullable = false)
    private String serviceName;
    @Column(name = "service_duration", nullable = false)
    private int serviceDuration;
    @Column(name = "service_cost", nullable = false)
    private double serviceCost;
    @Column(name = "service_gender_id", nullable = false)
    private int serviceGenderId;
    @Column(name = "display_seq", nullable = false)
    private int displaySeq;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "business_id")
    @JsonIgnore
    private BusinessDetails businessDetails;

    public BusinessDetails getBusinessDetails() {
        return businessDetails;
    }

    public void setBusinessDetails(BusinessDetails businessDetails) {
        this.businessDetails = businessDetails;
    }

    public Services() {
    }

    public Services(String serviceName, int serviceDuration, double serviceCost, int serviceGenderId, int displaySeq, BusinessDetails businessDetails) {
        this.serviceName = serviceName;
        this.serviceDuration = serviceDuration;
        this.serviceCost = serviceCost;
        this.serviceGenderId = serviceGenderId;
        this.displaySeq = displaySeq;
        this.businessDetails = businessDetails;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceDuration() {
        return serviceDuration;
    }

    public void setServiceDuration(int serviceDuration) {
        this.serviceDuration = serviceDuration;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getServiceGenderId() {
        return serviceGenderId;
    }

    public void setServiceGenderId(int serviceGenderId) {
        this.serviceGenderId = serviceGenderId;
    }

    public int getDisplaySeq() {
        return displaySeq;
    }

    public void setDisplaySeq(int displaySeq) {
        this.displaySeq = displaySeq;
    }
}
