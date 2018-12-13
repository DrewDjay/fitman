package com.fitman.java.repository;


import com.fitman.java.model.FitPote;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FitpoteRepository extends CrudRepository<FitPote,Integer> {
    default void save(Long sarko) {

    }
    /*FitPote findById(String id);
    List<FitPote>findByNom(String nom);

    Page<FitPote> findByNom(String nom, Pageable pageable);*/
    }

