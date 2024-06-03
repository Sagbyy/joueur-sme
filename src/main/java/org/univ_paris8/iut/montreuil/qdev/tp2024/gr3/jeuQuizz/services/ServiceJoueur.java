package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.services;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.bo.Joueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.services.interfaces.IServiceJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.enums.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.AnneeNaissanceInvalideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.JoueurDejaExistantException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.LangueInvalideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.NomLongueurException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ServiceJoueur implements IServiceJoueur {
    private static ServiceJoueur uniqueInstance = null;
    private ArrayList<Joueur> joueursDTO;

    private ServiceJoueur() {
        this.joueursDTO = new ArrayList<>();
    }

    public static ServiceJoueur getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ServiceJoueur();
        }
        return uniqueInstance;
    }

    @Override
    public Joueur ajouterJoueur(int id, String pseudo, String prenom, int anneeNaissance, Langue langue, HashSet<String> centresInteret, List<ScoreDTO> listeScores) throws JoueurDejaExistantException, AnneeNaissanceInvalideException, LangueInvalideException, NomLongueurException, NomLongueurException, LangueInvalideException {
        if (joueursDTO.stream().anyMatch(joueur -> joueur.getPseudo().equals(pseudo))) {
            throw new JoueurDejaExistantException("Le pseudo choisi est déjà utilisé par un autre joueur.");
        }

        if (prenom.length() < 3 || pseudo.length() < 3) {
            throw new NomLongueurException("Le prenom et le pseudo doivent contenir au moins 3 caractères.");
        }

        if (anneeNaissance < 1900 || anneeNaissance > LocalDate.now().getYear()) {
            throw new AnneeNaissanceInvalideException("L'année de naissance " + anneeNaissance + " est invalide.");
        }

        if (langue == null) {
            throw new LangueInvalideException("Le format de la langue est invalide.");
        }

        Joueur nouveauJoueur = new Joueur(id, pseudo, prenom, centresInteret, anneeNaissance, langue, listeScores);
        joueursDTO.add(nouveauJoueur);
        return nouveauJoueur;
    }

    @Override
    public ArrayList<Joueur> obtenirListeJoueurs() {
        if (joueursDTO.isEmpty()) {
            System.out.println("La liste des joueurs est vide.");
        }
        return new ArrayList<>(joueursDTO);
    }
}
