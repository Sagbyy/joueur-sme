package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.services.ServiceJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.*;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.services.interfaces.IServiceJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.enums.Langue;


public class ServiceJoueurMockPrenomOuPseudoLongueurTest {

    private IServiceJoueur service;
    @Before
    public void setUp() {
        service = ServiceJoueur.getInstance();
    }

    @Test(expected = LongueurException.class)
    public void ajouterJoueurAvecPrenomOuPseudoTropCourt() throws  FormatLangueInvalideException, LongueurException {
        service.ajouterJoueur(1, "D", "G", 1990, Langue.ES, new HashSet<>(), new ArrayList<>() {
        });
    }
}
