package com.bloom.recrutement.entity.quzze;

import javax.persistence.*;


@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "answer_id")
    protected int id;

    @OneToOne(mappedBy = "answer")
    private Question question;


}
