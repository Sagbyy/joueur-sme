package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;


import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.services.ServiceJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.*;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.services.interfaces.IServiceJoueur;


public class ServiceJoueurMockFormatLangueTest {

    private IServiceJoueur service;
    @Before
    public void setUp() {
        service = ServiceJoueur.getInstance();
    }

    @Test(expected = FormatLangueInvalideException.class)
    public void ajouterJoueurAvecLangueInvalide() throws FormatLangueInvalideException,  LongueurException {
        service.ajouterJoueur(1, "pseudoUnique", "John Doe", 1990, null, new HashSet<>(), new ArrayList<>());
    }
}
