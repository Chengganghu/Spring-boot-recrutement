package com.bloom.recrutement.entity.quzze;

import javax.persistence.*;

@Entity
public class Choix {
    /****************************************************************/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "choix_id")
    private int id;

    private boolean rightAns;
    private String description;

    public Choix(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isRightAns() {
        return rightAns;
    }

    public void setRightAns(boolean rightAns) {
        this.rightAns = rightAns;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
