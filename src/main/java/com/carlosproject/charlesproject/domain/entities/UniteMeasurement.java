package com.carlosproject.charlesproject.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unitemeasurement")
public class UniteMeasurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idum;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String nameum;

    public UniteMeasurement() {
    }

    public Long getIdum() {
        return idum;
    }

    public void setIdum(Long idum) {
        this.idum = idum;
    }

    public String getNameum() {
        return nameum;
    }

    public void setNameum(String nameum) {
        this.nameum = nameum;
    }

    
}
