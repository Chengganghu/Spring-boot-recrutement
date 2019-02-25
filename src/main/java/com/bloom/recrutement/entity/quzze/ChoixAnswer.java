package com.bloom.recrutement.entity.quzze;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class ChoixAnswer  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "choix_answer_id")
    private int id;

    @OneToMany( cascade = CascadeType.ALL)
    private List<Choix> choixList = new LinkedList<>();

    public ChoixAnswer(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Choix> getChoixList() {
        return choixList;
    }

    public void setChoixList(List<Choix> choixList) {
        this.choixList = choixList;
    }
}
