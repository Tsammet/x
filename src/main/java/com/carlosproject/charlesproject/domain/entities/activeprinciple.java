package com.carlosproject.charlesproject.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "activeprinciple")
public class activeprinciple {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idap;

    @Column(columnDefinition = "VARCHAR(60)", nullable = false)
    private String nameap;

    public activeprinciple() {
    }

    public Long getIdap() {
        return idap;
    }

    public void setIdap(Long idap) {
        this.idap = idap;
    }

    public String getNameap() {
        return nameap;
    }

    public void setNameap(String nameap) {
        this.nameap = nameap;
    }


}
