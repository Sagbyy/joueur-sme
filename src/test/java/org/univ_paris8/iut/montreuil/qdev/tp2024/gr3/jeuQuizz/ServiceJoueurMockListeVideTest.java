package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz;

import org.junit.Before;
import org.junit.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.*;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.bo.Joueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.services.interfaces.IServiceJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.enums.Langue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class ServiceJoueurMockListeVideTest  {

    private IServiceJoueur service;

    @Before
    public void setUp() {
        service = new ServiceJoueurMockListeVide();
    }

    @Test
    public void testAjouterEtObtenirJoueur() throws ListeVideException, FormatLangueInvalideException, LongueurException {
        HashSet<String> centresInteret = new HashSet<String>();
        List<ScoreDTO> listeScores = new ArrayList<ScoreDTO>();
        centresInteret.add("Gaming");
        Joueur joueurAjoute = service.ajouterJoueur(1, "kiki", "Kilian Mbappe", 1990, Langue.EN, centresInteret, listeScores);

        assertNotNull(joueurAjoute);
        assertEquals("Kilian Mbappe", joueurAjoute.getPrenom());
        assertEquals("kiki", joueurAjoute.getPseudo());
    }
}