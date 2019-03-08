package com.bloom.recrutement.entity.quzze;

import javax.persistence.*;

@Entity
public class OuverteAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ouverte_answer_id")
    private int id;

    private String answerDes;

    public OuverteAnswer(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswerDes() {
        return answerDes;
    }

    public void setAnswerDes(String answerDes) {
        this.answerDes = answerDes;
    }
}
