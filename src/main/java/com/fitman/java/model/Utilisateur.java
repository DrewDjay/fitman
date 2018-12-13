package com.fitman.java.model;

import javax.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_Utilisateur")
    private Long id;

    @Column(name = "Nom_Utilisateur")
    private String nom;

    @Column(name = "Prenom_Utilisateur")
    private String prenom;

    @Column(name = "Pseudo_Utilisateur")
    private String pseudo;

    @ManyToOne
    @JoinColumn(name = "Code_FitPote_Utilisateur")
    private FitPote codeFitPote;

    @Column(name = "Email_Utilisateur")
    private String email;


    @Column(name = "Mot_De_Passe_Utilisateur")
    private String mot_de_passe;

    @Column(name = "Date_Anniv_Utilisateur")
    private Date date_anniv;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(prenom, that.prenom) &&
                Objects.equals(pseudo, that.pseudo) &&
                Objects.equals(codeFitPote, that.codeFitPote) &&
                Objects.equals(email, that.email) &&
                Objects.equals(mot_de_passe, that.mot_de_passe) &&
                Objects.equals(date_anniv, that.date_anniv);
    }

    public Utilisateur() {
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nom, prenom, pseudo, codeFitPote, email, mot_de_passe, date_anniv);
    }

    public Utilisateur(Long id, String nom, String prenom, String pseudo, FitPote codeFitPote, String email, String mot_de_passe, Date date_anniv) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.codeFitPote = codeFitPote;
        this.email = email;
        this.mot_de_passe = mot_de_passe;
        this.date_anniv = date_anniv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public FitPote getCodeFitPote() {
        return codeFitPote;
    }

    public void setCodeFitPote(FitPote codeFitPote) {
        this.codeFitPote = codeFitPote;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public Date getDate_anniv() {
        return date_anniv;
    }

    public void setDate_anniv(Date date_anniv) {
        this.date_anniv = date_anniv;
    }
}