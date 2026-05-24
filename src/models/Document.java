package models;

import java.util.Date;

import models.Interfaces.Commandable;
import models.Interfaces.Consultable;

public abstract class Document
        implements Consultable, Commandable {

    private int id;
    private String titre;
    private String auteur;
    private Date datePublication;
    private boolean disponible;

    public Document(
            int id,
            String titre,
            String auteur,
            Date datePublication) {

        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.datePublication =
                datePublication;

        this.disponible = true;
    }

    @Override
    public void consulter() {
        System.out.println(
                "Consultation de "
                        + titre);
    }

    @Override
    public void commander() {
        System.out.println(
                "Commande du document "
                        + titre);
    }

    public abstract void afficherType();

    public String getTitre() {
        return titre;
    }

    public void afficherInformations() {
        System.out.println(titre);
    };
}