package com.fitman.Service;

import com.fitman.java.model.FitPote;
import com.fitman.java.model.Utilisateur;
import com.fitman.java.repository.FitpoteRepository;
import com.fitman.java.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    private FitpoteRepository fitpoteRepository;




    public void Hollande(Long idUtilisateur, Long idFitPote)throws Exception{
        Long sarko = idUtilisateur;
       Long macron = idFitPote;
    if (sarko !=macron){
        fitpoteRepository.save(sarko);}


       else {
            throw new Exception
            System.out.println("Veuillez choisir un autre fitpote");
        }

            }

        }




    }
}
