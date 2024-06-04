package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.bo.Joueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.*;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.services.interfaces.IServiceJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.enums.Langue;

public class ServiceJoueurMockFormatLangue implements IServiceJoueur {



    @Override
    public Joueur ajouterJoueur(int id, String pseudo, String prenom, int anneeNaissance, Langue langue, HashSet<String> centresInteret, List<ScoreDTO> listeScores) throws LongueurException, FormatLangueInvalideException {
        if (!(langue instanceof Langue)) {
            throw new FormatLangueInvalideException("Le format de la langue est invalide.");
        }
        return new Joueur(id, pseudo, prenom, centresInteret, anneeNaissance, langue, listeScores);
    }

    @Override
    public ArrayList<Joueur> obtenirListeJoueurs() throws ListeVideException {
        return null;
    }
}