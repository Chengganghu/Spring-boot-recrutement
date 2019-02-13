package com.bloom.recrutement.entity;

import javax.persistence.*;

@Entity
public class PostDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "description_id")
    private int id;

    private String place;
    private String departement;
    private String details;

    public int getId() {
        return this.id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public PostDescription() {

    }
}
