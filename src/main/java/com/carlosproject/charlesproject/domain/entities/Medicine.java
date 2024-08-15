package com.carlosproject.charlesproject.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(10)", nullable = false)
    private String proceedings;

    @Column(columnDefinition = "VARCHAR(100)", nullable = false)
    private String namemedicine;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String healthregister;
    
    // LOB ES PARA QUE SEA UN TEXTO LARGO OSEA TIPO TEXT
    @Lob
    @Column(nullable = false)
    private String description;

    @Column(columnDefinition = "VARCHAR(60)", nullable = false)
    private String descriptionshort;

    @ManyToOne
    @JoinColumn(name = "codemodeadmin")
    private ModeAdministration codemodeadmin;

    @ManyToOne
    @JoinColumn(name = "codeap")
    private activeprinciple codeap;

    @ManyToOne
    @JoinColumn(name = "codeum")
    private UniteMeasurement codeum;

    @Column(columnDefinition = "VARCHAR(100)", nullable = false)
    private String namerol;

    @ManyToOne
    @JoinColumn(name = "codelab")
    private Laboratory codelab;

    public Medicine() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProceedings() {
        return proceedings;
    }

    public void setProceedings(String proceedings) {
        this.proceedings = proceedings;
    }

    public String getNamemedicine() {
        return namemedicine;
    }

    public void setNamemedicine(String namemedicine) {
        this.namemedicine = namemedicine;
    }

    public String getHealthregister() {
        return healthregister;
    }

    public void setHealthregister(String healthregister) {
        this.healthregister = healthregister;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionshort() {
        return descriptionshort;
    }

    public void setDescriptionshort(String descriptionshort) {
        this.descriptionshort = descriptionshort;
    }

    public ModeAdministration getCodemodeadmin() {
        return codemodeadmin;
    }

    public void setCodemodeadmin(ModeAdministration codemodeadmin) {
        this.codemodeadmin = codemodeadmin;
    }

    public activeprinciple getCodeap() {
        return codeap;
    }

    public void setCodeap(activeprinciple codeap) {
        this.codeap = codeap;
    }

    public UniteMeasurement getCodeum() {
        return codeum;
    }

    public void setCodeum(UniteMeasurement codeum) {
        this.codeum = codeum;
    }

    public String getNamerol() {
        return namerol;
    }

    public void setNamerol(String namerol) {
        this.namerol = namerol;
    }

    public Laboratory getCodelab() {
        return codelab;
    }

    public void setCodelab(Laboratory codelab) {
        this.codelab = codelab;
    }

    

    
}
