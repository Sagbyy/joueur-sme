package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.services;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.services.interfaces.IServiceJoueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.enums.Langues;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.AnneeNaissanceInvalideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.JoueurDejaExistantException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.LangueInvalideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.exceptions.NomLongueurException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class ServiceJoueur implements IServiceJoueur {
    private static ServiceJoueur uniqueInstance = null;
    private ArrayList<JoueurDTO> joueursDTO;

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
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaissance, Langues langue, HashSet<String> centresInteret) throws JoueurDejaExistantException, AnneeNaissanceInvalideException, LangueInvalideException, NomLongueurException, NomLongueurException, LangueInvalideException {
        if (joueursDTO.stream().anyMatch(joueur -> joueur.getPseudo().equals(pseudo))) {
            throw new JoueurDejaExistantException("Le pseudo choisi est déjà utilisé par un autre joueur.");
        }

        if (nom.length() < 3 || pseudo.length() < 3) {
            throw new NomLongueurException("Le nom et le pseudo doivent contenir au moins 3 caractères.");
        }

        if (anneeNaissance < 1900 || anneeNaissance > LocalDate.now().getYear()) {
            throw new AnneeNaissanceInvalideException("L'année de naissance " + anneeNaissance + " est invalide.");
        }

        if (langue == null) {
            throw new LangueInvalideException("Le format de la langue est invalide.");
        }

        JoueurDTO nouveauJoueur = new JoueurDTO(nom, pseudo, anneeNaissance, langue, centresInteret);
        joueursDTO.add(nouveauJoueur);
        return nouveauJoueur;
    }

    @Override
    public ArrayList<JoueurDTO> obtenirListeJoueurs() {
        if (joueursDTO.isEmpty()) {
            System.out.println("La liste des joueurs est vide.");
        }
        return new ArrayList<>(joueursDTO);
    }
}
