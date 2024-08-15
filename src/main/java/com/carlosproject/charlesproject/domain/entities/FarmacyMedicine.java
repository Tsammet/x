package com.carlosproject.charlesproject.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "farmacymedicine")
public class FarmacyMedicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Farmacy idfarmacy;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Medicine idmedicinefatrm;

    private Double price;

    public FarmacyMedicine() {
    }

    public Farmacy getIdfarmacy() {
        return idfarmacy;
    }

    public void setIdfarmacy(Farmacy idfarmacy) {
        this.idfarmacy = idfarmacy;
    }

    public Medicine getIdmedicinefatrm() {
        return idmedicinefatrm;
    }

    public void setIdmedicinefatrm(Medicine idmedicinefatrm) {
        this.idmedicinefatrm = idmedicinefatrm;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    
}
