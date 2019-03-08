package com.bloom.recrutement.entity.quzze;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
public class QuestionTag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_tag_id")
    private int id;

    private String name;

    @ManyToMany(mappedBy = "taglist",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnoreProperties("taglist")
    private List<Question> questionlist;

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

    public List<Question> getQuestionlist() {
        return questionlist;
    }

    public void setQuestionlist(List<Question> questionlist) {
        this.questionlist = questionlist;
    }
}
