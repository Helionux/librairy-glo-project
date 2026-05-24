package models;

import java.util.Date;

public class Commande {

    private int idCommande;
    private Date dateCommande;
    private String etatCommande;

    private Utilisateur utilisateur;
    private Document document;

    public Commande(
            int idCommande,
            Utilisateur utilisateur,
            Document document) {

        this.idCommande = idCommande;
        this.utilisateur = utilisateur;
        this.document = document;
    }
}