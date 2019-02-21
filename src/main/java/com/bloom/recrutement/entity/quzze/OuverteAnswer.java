package com.bloom.recrutement.entity.quzze;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class OuverteAnswer extends Answer{


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
