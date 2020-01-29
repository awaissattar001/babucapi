package com.techamist.babucapi.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "business_details")
public class BusinessDetails {
    @Id
    @Column(name ="business_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int businessId;
    @Column(name = "active_status", nullable = true)
    private int activeStatus;
    @Column(name = "owner_name", nullable = true)
    private String ownerName;
    @Column(name = "contact_no", nullable = true)
    private int contactNo;
    @Column(name = "company_no", nullable = true)
    private int companyNo;
    @Column(name = "vat_no", nullable = true)
    private int vatNo;
    @Column(name = "business_name", nullable = true)
    private String businessName;
    @Column(name = "address_line1", nullable = true)
    private String addressLine1;
    @Column(name = "address_line2", nullable = true)
    private String addressLine2;
    @Column(name = "address_line3", nullable = true)
    private String addressLine3;
    @Column(name = "town_city", nullable = true)
    private String townCity;
    @Column(name = "postcode", nullable = true)
    private String postcode;
    @Column(name = "region", nullable = true)
    private String region;
    @Column(name = "country", nullable = true)
    private String country;
    @Column(name = "number_of_staff", nullable = true)
    private int numberOfStaff;
    @Column(name = "instagram_link", nullable = true)
    private String instagramLink;
    @Column(name = "facebook_link", nullable = true)
    private String facebookLink;
    @Column(name = "longitude", nullable = true)
    private float longitude;
    @Column(name = "latitude", nullable = true)
    private float latitude;

//    @OneToOne(fetch = FetchType.LAZY, targetEntity = ServiceHours.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "business_id", referencedColumnName = "business_id")
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "businessDetails")
    private ServiceHours serviceHours;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "businessDetails")
    private List<Services> services;

    public List<Services> getServices() {
        return services;
    }

    public void setServices(List<Services> services) {
        this.services = services;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }


    public int getActiveStatus() {
        return activeStatus;
    }
    public void setActiveStatus(int activeStatus) {
        this.activeStatus = activeStatus;
    }


    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    public int getContactNo() {
        return contactNo;
    }
    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }


    public int getCompanyNo() {
        return companyNo;
    }
    public void setCompanyNo(int companyNo) {
        this.companyNo = companyNo;
    }


    public int getVatNo() {
        return vatNo;
    }
    public void setVatNo(int vatNo) {
        this.vatNo = vatNo;
    }


    public String getBusinessName() {
        return businessName;
    }
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }


    public String getAddressLine1() {
        return addressLine1;
    }
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }


    public String getAddressLine2() {
        return addressLine2;
    }
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }


    public String getAddressLine3() {
        return addressLine3;
    }
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }


    public String getTownCity() {
        return townCity;
    }
    public void setTownCity(String townCity) {
        this.townCity = townCity;
    }


    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }


    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }


    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }


    public int getNumberOfStaff() {
        return numberOfStaff;
    }
    public void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }


    public String getInstagramLink() {
        return instagramLink;
    }
    public void setInstagramLink(String instagramLink) {
        this.instagramLink = instagramLink;
    }


    public String getFacebookLink() {
        return facebookLink;
    }
    public void setFacebookLink(String facebookLink) {
        this.facebookLink = facebookLink;
    }


    public float getLongitude() {
        return longitude;
    }
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    public float getLatitude() {
        return latitude;
    }
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    public ServiceHours getServiceHours() {
        return serviceHours;
    }

    public void setServiceHours(ServiceHours serviceHours) {
        this.serviceHours = serviceHours;
    }
}
