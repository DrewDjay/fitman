package com.fitman.java.model;

import javax.persistence.*;

@Entity
@Table(name="exercices_sport")
public class ExercicesSport {
    @Id
    @Column(name = "id_Sport")
    private Integer IdSport;
    @Column(name = "Nom_Sport")

    private String NomSport;
    @Column(name = "Descriptif_Sport")
    private String DescriptifSport;
    @Column(name = "Duree_Sport")
    private Integer DureeSport;
    @Column(name = "Materiel_Sport")
    private String MaterielSport;

    public ExercicesSport(Integer idSport, String nomSport, String descriptifSport, Integer dureeSport, String materielSport) {
        IdSport = idSport;
        NomSport = nomSport;
        DescriptifSport = descriptifSport;
        DureeSport = dureeSport;
        MaterielSport = materielSport;
    }

    public Integer getIdSport() {
        return IdSport;

    }

    public void setIdSport(Integer idSport) {
        IdSport = idSport;
    }

    public String getNomSport() {
        return NomSport;
    }

    public void setNomSport(String nomSport) {
        NomSport = nomSport;
    }

    public String getDescriptifSport() {
        return DescriptifSport;
    }

    public void setDescriptifSport(String descriptifSport) {
        DescriptifSport = descriptifSport;
    }

    public Integer getDureeSport() {
        return DureeSport;
    }

    public void setDureeSport(Integer dureeSport) {
        DureeSport = dureeSport;
    }

    public String getMaterielSport() {
        return MaterielSport;
    }

    public void setMaterielSport(String materielSport) {
        MaterielSport = materielSport;
    }


}
