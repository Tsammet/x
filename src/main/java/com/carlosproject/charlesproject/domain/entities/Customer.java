package com.carlosproject.charlesproject.domain.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(columnDefinition = "VARCHAR(20)", nullable = false)
    private String idcustomer;
    
    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String namecustomer;
    
    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String lastnamecustomer;
    
    @ManyToOne
    @JoinColumn(name = "codecitycustomer")
    private City cities;
    
    @Column(columnDefinition = "VARCHAR(100)", nullable = false)
    private String emailcustomer;

    private Date date;

    private Double lon;

    private Double latitud;

    public Customer() {
    }

    public String getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(String idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getNamecustomer() {
        return namecustomer;
    }

    public void setNamecustomer(String namecustomer) {
        this.namecustomer = namecustomer;
    }

    public String getLastnamecustomer() {
        return lastnamecustomer;
    }

    public void setLastnamecustomer(String lastnamecustomer) {
        this.lastnamecustomer = lastnamecustomer;
    }

    public City getCities() {
        return cities;
    }

    public void setCities(City cities) {
        this.cities = cities;
    }

    public String getEmailcustomer() {
        return emailcustomer;
    }

    public void setEmailcustomer(String emailcustomer) {
        this.emailcustomer = emailcustomer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

}
