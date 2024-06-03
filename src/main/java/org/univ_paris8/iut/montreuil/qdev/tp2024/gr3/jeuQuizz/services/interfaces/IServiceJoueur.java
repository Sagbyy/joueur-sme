package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.enums.Langues;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.AnneeNaissanceInvalideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.JoueurDejaExistantException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.LangueInvalideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.NomLongueurException;

import java.util.ArrayList;
import java.util.HashSet;

public interface IServiceJoueur {
     public JoueurDTO ajouterJoueur(String nom, String pseudo, int annéeNaissance, Langues langue, HashSet<String> centreInteret) throws JoueurDejaExistantException, AnneeNaissanceInvalideException, LangueInvalideException, NomLongueurException;
    ArrayList<JoueurDTO> obtenirListeJoueurs();
}
