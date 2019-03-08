package com.bloom.recrutement.entity.quzze;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ChoixAnswer  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "choix_answer_id")
    private int id;

    @OneToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Choix> choixList = new HashSet<>();

    public ChoixAnswer(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Choix> getChoixList() {
        return choixList;
    }

    public void setChoixList(Set<Choix> choixList) {
        this.choixList = choixList;
    }
}
