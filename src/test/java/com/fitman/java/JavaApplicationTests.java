package com.fitman.java;

import com.fitman.java.model.Utilisateur;
import com.fitman.java.repository.FitpoteRepository;
import com.fitman.java.repository.UtilisateurRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaApplicationTests {

	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Test
	public void testConnexionBdd(){

		Utilisateur utilisateur = utilisateurRepository.findOne(1L);

		Assert.assertTrue(utilisateur.getNom().equals("Patrick") );


	}

	@Test
	public void contextLoads() {
	}

}

