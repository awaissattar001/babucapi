package com.techamist.babucapi.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "service_hours")
public class ServiceHours {

//    @Column(name = "business_id", nullable = false)
//    private int businessId;
    @Id
    @Column(name = "opening_time_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int openingTimeId;
    @Column(name = "mon_start", nullable = true)
    private Time monStart;
    @Column(name = "mon_end", nullable = true)
    private Time monEnd;
    @Column(name = "mon_barbers", nullable = true)
    private int monBarbers;
    @Column(name = "tue_start", nullable = true)
    private Time tueStart;
    @Column(name = "tue_end", nullable = true)
    private Time tueEnd;
    @Column(name = "tue_barbers", nullable = true)
    private int tueBarbers;
    @Column(name = "wed_start", nullable = true)
    private Time wedStart;
    @Column(name = "wed_end", nullable = true)
    private Time wedEnd;
    @Column(name = "wed_barbers", nullable = true)
    private int wedBarbers;
    @Column(name = "thu_start", nullable = true)
    private Time thuStart;
    @Column(name = "thu_end", nullable = true)
    private Time thuEnd;
    @Column(name = "thu_barbers", nullable = true)
    private int thuBarbers;
    @Column(name = "fri_start", nullable = true)
    private Time friStart;
    @Column(name = "fri_end", nullable = true)
    private Time friEnd;
    @Column(name = "fri_barbers", nullable = true)
    private int friBarbers;
    @Column(name = "sat_start", nullable = true)
    private Time satStart;
    @Column(name = "sat_end", nullable = true)
    private Time satEnd;
    @Column(name = "sat_barbers", nullable = true)
    private int satBarbers;
    @Column(name = "sun_start", nullable = true)
    private Time sunStart;
    @Column(name = "sun_end", nullable = true)
    private Time sunEnd;
    @Column(name = "sun_barbers", nullable = true)
    private int sunBarbers;

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

//    public int getBusinessId() {
//        return businessId;
//    }
//    public void setBusinessId(int businessId) {
//        this.businessId = businessId;
//    }


    public int getOpeningTimeId() {
        return openingTimeId;
    }
    public void setOpeningTimeId(int openingTimeId) {
        this.openingTimeId = openingTimeId;
    }


    public Time getMonStart() {
        return monStart;
    }
    public void setMonStart(Time monStart) {
        this.monStart = monStart;
    }


    public Time getMonEnd() {
        return monEnd;
    }
    public void setMonEnd(Time monEnd) {
        this.monEnd = monEnd;
    }


    public int getMonBarbers() {
        return monBarbers;
    }
    public void setMonBarbers(int monBarbers) {
        this.monBarbers = monBarbers;
    }


    public Time getTueStart() {
        return tueStart;
    }
    public void setTueStart(Time tueStart) {
        this.tueStart = tueStart;
    }


    public Time getTueEnd() {
        return tueEnd;
    }
    public void setTueEnd(Time tueEnd) {
        this.tueEnd = tueEnd;
    }


    public int getTueBarbers() {
        return tueBarbers;
    }
    public void setTueBarbers(int tueBarbers) {
        this.tueBarbers = tueBarbers;
    }


    public Time getWedStart() {
        return wedStart;
    }
    public void setWedStart(Time wedStart) {
        this.wedStart = wedStart;
    }


    public Time getWedEnd() {
        return wedEnd;
    }
    public void setWedEnd(Time wedEnd) {
        this.wedEnd = wedEnd;
    }


    public int getWedBarbers() {
        return wedBarbers;
    }
    public void setWedBarbers(int wedBarbers) {
        this.wedBarbers = wedBarbers;
    }


    public Time getThuStart() {
        return thuStart;
    }
    public void setThuStart(Time thuStart) {
        this.thuStart = thuStart;
    }


    public Time getThuEnd() {
        return thuEnd;
    }
    public void setThuEnd(Time thuEnd) {
        this.thuEnd = thuEnd;
    }


    public int getThuBarbers() {
        return thuBarbers;
    }
    public void setThuBarbers(int thuBarbers) {
        this.thuBarbers = thuBarbers;
    }


    public Time getFriStart() {
        return friStart;
    }
    public void setFriStart(Time friStart) {
        this.friStart = friStart;
    }


    public Time getFriEnd() {
        return friEnd;
    }
    public void setFriEnd(Time friEnd) {
        this.friEnd = friEnd;
    }


    public int getFriBarbers() {
        return friBarbers;
    }
    public void setFriBarbers(int friBarbers) {
        this.friBarbers = friBarbers;
    }


    public Time getSatStart() {
        return satStart;
    }
    public void setSatStart(Time satStart) {
        this.satStart = satStart;
    }


    public Time getSatEnd() {
        return satEnd;
    }
    public void setSatEnd(Time satEnd) {
        this.satEnd = satEnd;
    }


    public int getSatBarbers() {
        return satBarbers;
    }
    public void setSatBarbers(int satBarbers) {
        this.satBarbers = satBarbers;
    }


    public Time getSunStart() {
        return sunStart;
    }
    public void setSunStart(Time sunStart) {
        this.sunStart = sunStart;
    }


    public Time getSunEnd() {
        return sunEnd;
    }
    public void setSunEnd(Time sunEnd) {
        this.sunEnd = sunEnd;
    }


    public int getSunBarbers() {
        return sunBarbers;
    }
    public void setSunBarbers(int sunBarbers) {
        this.sunBarbers = sunBarbers;
    }
}
