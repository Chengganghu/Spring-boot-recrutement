package com.bloom.recrutement.entity.quzze;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
    private int id;
    /**
     * relation between question tag
     */
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "tag",
    joinColumns = @JoinColumn(name = "question"),
    inverseJoinColumns = @JoinColumn(name = "tag"))
    private List<QuestionTag> list;

    private QuestionType questionType;
    private String description;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "answer_id")
    private Answer answer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<QuestionTag> getList() {
        return list;
    }

    public void setList(List<QuestionTag> list) {
        this.list = list;
    }

    public Question() {

    }
}
