package com.bloom.recrutement.entity.quzze;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class ChoixAnswer extends Answer {

    @OneToMany(mappedBy = "choixAnswer", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Choix> list;

    public ChoixAnswer(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Choix> getList() {
        return list;
    }

    public void setList(List<Choix> list) {
        this.list = list;
    }
}
