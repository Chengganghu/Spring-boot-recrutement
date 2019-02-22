package com.bloom.recrutement.entity.quzze;

import javax.persistence.*;

@Entity
public class Choix {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "choix_id")
    private int id;

    private boolean rightAns;
    private String Description;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "answer_id")
    private ChoixAnswer choixAnswer;
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
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public ChoixAnswer getChoixAnswer() {
        return choixAnswer;
    }

    public void setChoixAnswer(ChoixAnswer choixAnswer) {
        this.choixAnswer = choixAnswer;
    }
}
