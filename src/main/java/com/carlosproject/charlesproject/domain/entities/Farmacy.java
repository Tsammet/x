package com.carlosproject.charlesproject.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="farmacies")
public class Farmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfarmacy;

    @Column(columnDefinition = "VARCHAR(60)", nullable = false)
    private String namefarmacy;

    @Column(columnDefinition = "VARCHAR(100)", nullable = false)
    private String addressfarmacy;

    private Double lon;
    
    private Double latfarmacy;

    @ManyToOne
    @JoinColumn(name = "codecityfarm")
    private City cities;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String logofarmacy;

    public Farmacy() {
    }

    public Long getIdfarmacy() {
        return idfarmacy;
    }

    public void setIdfarmacy(Long idfarmacy) {
        this.idfarmacy = idfarmacy;
    }

    public String getNamefarmacy() {
        return namefarmacy;
    }

    public void setNamefarmacy(String namefarmacy) {
        this.namefarmacy = namefarmacy;
    }

    public String getAddressfarmacy() {
        return addressfarmacy;
    }

    public void setAddressfarmacy(String addressfarmacy) {
        this.addressfarmacy = addressfarmacy;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLatfarmacy() {
        return latfarmacy;
    }

    public void setLatfarmacy(Double latfarmacy) {
        this.latfarmacy = latfarmacy;
    }

    public City getCities() {
        return cities;
    }

    public void setCities(City cities) {
        this.cities = cities;
    }

    public String getLogofarmacy() {
        return logofarmacy;
    }

    public void setLogofarmacy(String logofarmacy) {
        this.logofarmacy = logofarmacy;
    }

  

}
