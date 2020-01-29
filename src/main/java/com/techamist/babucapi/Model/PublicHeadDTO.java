package com.techamist.babucapi.Model;

public class PublicHeadDTO {
    String responseCode;

    public PublicHeadDTO(String responseCode) {
        this.responseCode = responseCode;
    }

    public PublicHeadDTO() {
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
}
