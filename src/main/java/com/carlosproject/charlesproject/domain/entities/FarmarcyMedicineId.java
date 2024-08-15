package com.carlosproject.charlesproject.domain.entities;

import java.io.Serializable;
import jakarta.persistence.Embeddable;

@Embeddable
public class FarmarcyMedicineId implements Serializable{
    
    private int idfarmacy;
    private int idmedicinefatrm;

    // Constructores, getters, setters, equals y hashCode
    
    public FarmarcyMedicineId() {
    }

   
    public int getIdfarmacy() {
        return idfarmacy;
    }


    public void setIdfarmacy(int idfarmacy) {
        this.idfarmacy = idfarmacy;
    }


    public int getIdmedicinefatrm() {
        return idmedicinefatrm;
    }


    public void setIdmedicinefatrm(int idmedicinefatrm) {
        this.idmedicinefatrm = idmedicinefatrm;
    }

}
