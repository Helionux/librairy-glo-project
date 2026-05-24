package models;

import java.util.ArrayList;
import java.util.List;

import models.Interfaces.Authentifiable;

public abstract class Utilisateur
        implements Authentifiable {

    private int id;
    private String nom;
    private String email;
    private String motDePasse;

    // ASSOCIATIONS
    private List<Emprunt> emprunts =
            new ArrayList<>();

    private List<Commande> commandes =
            new ArrayList<>();

    public Utilisateur(
            int id,
            String nom,
            String email,
            String motDePasse) {

        this.id = id;
        this.nom = nom;
        this.email = email;
        this.motDePasse =
                motDePasse;
    }

    @Override
    public boolean seConnecter(
            String email,
            String mdp) {

        return this.email.equals(email)
                && this.motDePasse.equals(mdp);
    }

    public abstract void afficherRole();

    public void ajouterEmprunt(
            Emprunt e) {

        emprunts.add(e);
    }

    @Override
    public String getNom() {
        return nom;
    }
}