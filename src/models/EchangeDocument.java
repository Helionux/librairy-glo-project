package models;

import java.util.Date;
import java.util.UUID;

public class EchangeDocument {

    private UUID id;
    private Date dateDemande;
    private Date dateValidation;
    private String statut;

    private Document document;
    private Bibliotheque bibliotheque;
    private Partenaire partenaire;

    public EchangeDocument() {
    }

    public EchangeDocument(UUID id,
                            Date dateDemande,
                            Date dateValidation,
                            String statut,
                            Document document,
                            Bibliotheque bibliotheque,
                            Partenaire partenaire) {

        this.id = id;
        this.dateDemande = dateDemande;
        this.dateValidation = dateValidation;
        this.statut = statut;
        this.document = document;
        this.bibliotheque = bibliotheque;
        this.partenaire = partenaire;
    }
}