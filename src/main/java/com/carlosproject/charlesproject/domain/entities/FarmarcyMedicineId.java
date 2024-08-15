package com.carlosproject.charlesproject.domain.entities;

// SERIALIZABLE ES PARA QUE JPA PUEDA GESTIONAR CORRECTAMENTE LAS CLAVES PRIMARIAS COMPUESTAS
import java.io.Serializable;
import jakarta.persistence.Embeddable;

// EMBEDDEABLE INDICA QUE ES PARTE DE UNA CLAVE COMPUESTA, JPA VA A USAR LOS CAMPOS DE ESTA CLASE PARA FORMAR UNA CLAVE PRIMARA DE OTRA ENTIDAD 
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
