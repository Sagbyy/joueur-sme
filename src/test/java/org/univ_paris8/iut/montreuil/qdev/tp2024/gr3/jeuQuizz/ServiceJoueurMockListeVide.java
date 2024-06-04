package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.bo.Joueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.services.interfaces.IServiceJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.enums.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.*;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ServiceJoueurMockListeVide implements IServiceJoueur {
    private ArrayList<Joueur> joueursDTO = new ArrayList<Joueur>();


    @Override
    public Joueur ajouterJoueur(int id, String pseudo, String prenom, int anneeNaissance, Langue langue, HashSet<String> centresInteret, List<ScoreDTO> listeScores) throws  LongueurException {
        Joueur joueur = new Joueur(id, pseudo, prenom, centresInteret, anneeNaissance, langue, listeScores);
        joueursDTO.add(joueur);
        return joueur;
    }

    @Override
    public ArrayList<Joueur> obtenirListeJoueurs() throws ListeVideException {
        if (joueursDTO.isEmpty()) {
            throw new ListeVideException("La liste des joueurs est vide.");
        }
        return joueursDTO;
    }
}
