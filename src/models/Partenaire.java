package models;

import models.enums.TypePartenaire;

public class Partenaire {

    private String partenaireId;
    private String nom;
    private String adresse;
    private String contact;
    private TypePartenaire type;

    public Partenaire() {
    }

    public Partenaire(String partenaireId,
                       String nom,
                       String adresse,
                       String contact,
                       TypePartenaire type) {

        this.partenaireId = partenaireId;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
        this.type = type;
    }
}