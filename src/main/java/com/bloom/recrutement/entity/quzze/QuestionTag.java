package com.bloom.recrutement.entity.quzze;

import javax.persistence.*;
import java.util.List;

@Entity
public class QuestionTag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_tag_id")
    private int id;

    private String name;
    @ManyToMany(mappedBy = "list")
    private List<Question> list;

    public QuestionTag() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getList() {
        return list;
    }

    public void setList(List<Question> list) {
        this.list = list;
    }
}
