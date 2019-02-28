package com.bloom.recrutement.entity.quzze;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
    },fetch = FetchType.EAGER)
    @JoinTable(name = "tag",
    joinColumns = @JoinColumn(name = "question"),
    inverseJoinColumns = @JoinColumn(name = "tag"))
    @JsonIgnoreProperties("questionlist")
    private List<QuestionTag> taglist;

    private QuestionType questionType;
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ouverte_answer_id")
    private OuverteAnswer ouverteAnswer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "choix_answer_id")
    private ChoixAnswer choixAnswer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<QuestionTag> getTaglist() {
        return taglist;
    }

    public void setTaglist(List<QuestionTag> taglist) {
        this.taglist = taglist;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OuverteAnswer getOuverteAnswer() {
        return ouverteAnswer;
    }

    public void setOuverteAnswer(OuverteAnswer ouverteAnswer) {
        this.ouverteAnswer = ouverteAnswer;
    }

    public ChoixAnswer getChoixAnswer() {
        return choixAnswer;
    }

    public void setChoixAnswer(ChoixAnswer choixAnswer) {
        this.choixAnswer = choixAnswer;
    }

    public Question() {

    }
}
