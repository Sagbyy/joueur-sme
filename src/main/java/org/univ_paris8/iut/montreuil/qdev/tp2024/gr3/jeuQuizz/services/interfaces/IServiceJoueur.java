package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.bo.Joueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.enums.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.AnneeNaissanceInvalideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.JoueurDejaExistantException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.LangueInvalideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.NomLongueurException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public interface IServiceJoueur {
    Joueur ajouterJoueur(int id, String pseudo, String prenom, int anneeNaissance, Langue langue, HashSet<String> centresInteret, List<ScoreDTO> listeScores) throws JoueurDejaExistantException, AnneeNaissanceInvalideException, LangueInvalideException, NomLongueurException;
    ArrayList<Joueur> obtenirListeJoueurs();
}
