package com.techamist.babucapi.Model;

public class BusinessDetailsDTO extends PublicHeadDTO{
    int business_id;
    int active_status;
    String owner_name;
    int contact_no;
    int company_no;
    int vat_no;
    String business_name;
    String address_line1;
    String address_line2;
    String address_line3;
    String town_city;
    String postcode;
    String region;
    String country;
    int number_of_staff;
    String instagram_link;
    String facebook_link;
    float longitude;
    float latitude;

    public BusinessDetailsDTO() {
    }

    public BusinessDetailsDTO(int business_id, int active_status, String owner_name, int contact_no, int company_no, int vat_no, String business_name, String address_line1, String address_line2, String address_line3, String town_city, String postcode, String region, String country, int number_of_staff, String instagram_link, String facebook_link, float longitude, float latitude) {
        this.business_id = business_id;
        this.active_status = active_status;
        this.owner_name = owner_name;
        this.contact_no = contact_no;
        this.company_no = company_no;
        this.vat_no = vat_no;
        this.business_name = business_name;
        this.address_line1 = address_line1;
        this.address_line2 = address_line2;
        this.address_line3 = address_line3;
        this.town_city = town_city;
        this.postcode = postcode;
        this.region = region;
        this.country = country;
        this.number_of_staff = number_of_staff;
        this.instagram_link = instagram_link;
        this.facebook_link = facebook_link;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public BusinessDetailsDTO(String business_name) {
        this.business_name = business_name;
    }

    public int getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(int business_id) {
        this.business_id = business_id;
    }

    public int getActive_status() {
        return active_status;
    }

    public void setActive_status(int active_status) {
        this.active_status = active_status;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public int getContact_no() {
        return contact_no;
    }

    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
    }

    public String getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
    }

    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    public String getAddress_line3() {
        return address_line3;
    }

    public void setAddress_line3(String address_line3) {
        this.address_line3 = address_line3;
    }

    public String getTown_city() {
        return town_city;
    }

    public void setTown_city(String town_city) {
        this.town_city = town_city;
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

    public int getNumber_of_staff() {
        return number_of_staff;
    }

    public void setNumber_of_staff(int number_of_staff) {
        this.number_of_staff = number_of_staff;
    }

    public String getInstagram_link() {
        return instagram_link;
    }

    public void setInstagram_link(String instagram_link) {
        this.instagram_link = instagram_link;
    }

    public String getFacebook_link() {
        return facebook_link;
    }

    public void setFacebook_link(String facebook_link) {
        this.facebook_link = facebook_link;
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

    public int getCompany_no() {
        return company_no;
    }

    public void setCompany_no(int company_no) {
        this.company_no = company_no;
    }

    public int getVat_no() {
        return vat_no;
    }

    public void setVat_no(int vat_no) {
        this.vat_no = vat_no;
    }
}
