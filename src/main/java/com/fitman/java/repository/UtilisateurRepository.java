package com.fitman.java.repository;


import com.fitman.java.model.Utilisateur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface UtilisateurRepository extends CrudRepository<Utilisateur,Long> {
    Utilisateur findById (String id);

    List<Utilisateur> findByNomAndPrenom (String nom, String prenom);

    List<Utilisateur> findByPseudo (String pseudo);

    List<Utilisateur> findByCodeFitPote (Long codeFitPote);


    List<Utilisateur> findByEmail (String email);

    Page<Utilisateur> findByNom (String nom, Pageable pageable);

    List<Utilisateur> findByCodeFitPote_Id(Integer id);
}