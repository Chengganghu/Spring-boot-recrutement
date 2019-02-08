package com.bloom.recrutement.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Candidature {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "candidature_id")
    private int id;

    private String prenom;
    private String nom;
    private String email;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date birthday;
    private Status status;
    private String motdepasse;
    private String cvname;
    private String lettrename;



    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "post_id")
    private Post post;

    public Candidature() {
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMotdePass() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public String getCvname() {
        return cvname;
    }

    public void setCvname(String cvname) {
        this.cvname = cvname;
    }

    public String getLettrename() {
        return lettrename;
    }

    public void setLettrename(String lettrename) {
        this.lettrename = lettrename;
    }

}
