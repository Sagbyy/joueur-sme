package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.bo;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.utils.enums.Langue;

import java.util.HashSet;
import java.util.List;

public class Joueur {
// Attributs privés (encapsulation)
    private int id;
    private String pseudo;
    private String prenom;
    private HashSet<String> centreInterets;
    private int anneeNaissance;
    private Langue langue;
    private List<ScoreDTO> listeScores;

    // Constructeur avec paramètres
    public Joueur(int id, String pseudo, String prenom, HashSet<String> centreInterets, int anneeNaissance, Langue langue, List<ScoreDTO> listeScores) {
        this.id = id;
        this.pseudo = pseudo;
        this.prenom = prenom;
        this.centreInterets = new HashSet<String>(centreInterets);
        this.anneeNaissance = anneeNaissance;
        this.langue = langue;
        this.listeScores = listeScores;
    }

    // Getters (accesseurs)
    public int getId() {
        return id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCentreInterets() {
        return centreInterets;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public Langue getLangue() {
        return langue;
    }

    public List<ScoreDTO> getListeScores() {
        return listeScores;
    }

    // Setters (mutateurs)
    public void setId(int id) {
        this.id = id;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCentreInterets(String centreInterets) {
        this.centreInterets = centreInterets;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    public void setListeScores(List<ScoreDTO> listeScores) {
        this.listeScores = listeScores;
    }
}
