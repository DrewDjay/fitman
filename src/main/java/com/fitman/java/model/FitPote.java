package com.fitman.java.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="fitpote")
public class FitPote {


    @Id
    @Column (name="Id_Fitpote")
   private Long id;

    @OneToMany(mappedBy = "codeFitPote", fetch = FetchType.EAGER)
    private List<Utilisateur> utilisateur;

    public List <Utilisateur> getUtilisateur() {
        return utilisateur;
    }

    public FitPote() {
    }

    public FitPote(List <Utilisateur> utilisateur) {
        this.utilisateur = utilisateur;
    }

    public void setUtilisateur(List <Utilisateur> utilisateur) {
        this.utilisateur = utilisateur;
    }

    public FitPote(Long id, String nomFitpote) {
        this.id = id;
        NomFitpote = nomFitpote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomFitpote() {
        return NomFitpote;
    }

    public void setNomFitpote(String nomFitpote) {
        NomFitpote = nomFitpote;
    }

    @Column (name="Nom_Fitpote")

    private String NomFitpote;









}
