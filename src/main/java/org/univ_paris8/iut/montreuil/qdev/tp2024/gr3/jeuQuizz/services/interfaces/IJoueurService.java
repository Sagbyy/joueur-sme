package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.entities.bo.Joueur;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.jeuQuizz.exceptions.NomAvecEspaceException;

import java.util.List;

public interface IJoueurService {
    List<Joueur> getJoueurs() throws NomAvecEspaceException;
}
