package com.carlosproject.charlesproject.domain.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "farmacymedicine")
public class FarmacyMedicine {

    @EmbeddedId
    private FarmarcyMedicineId id;

    private Double price;

    public FarmacyMedicine() {
    }

    public FarmarcyMedicineId getId() {
        return id;
    }

    public void setId(FarmarcyMedicineId id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    
}
