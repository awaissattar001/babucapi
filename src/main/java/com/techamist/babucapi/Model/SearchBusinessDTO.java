package com.techamist.babucapi.Model;

import com.techamist.babucapi.Entities.BusinessDetails;

public class SearchBusinessDTO extends BusinessDetails{
    private BusinessDetails businessDetails;
    private double distnce;

    public SearchBusinessDTO() {
    }

    public SearchBusinessDTO(BusinessDetails businessDetails, double distance) {
        this.businessDetails = businessDetails;
        this.distnce = distance;
    }

    public BusinessDetails getBusinessDetails() {
        return businessDetails;
    }

    public void setBusinessDetails(BusinessDetails businessDetails) {
        this.businessDetails = businessDetails;
    }

    public double getDistnce() {
        return distnce;
    }

    public void setDistnce(double distnce) {
        this.distnce = distnce;
    }
}
