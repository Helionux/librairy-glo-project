package models;

import java.util.Date;
import java.util.UUID;

import models.enums.StatutReservation;

public class Reservation {

    private UUID id;
    private Date dateReservation;
    private StatutReservation statut;

    private Utilisateur utilisateur;
    private Document document;

    public Reservation() {
    }

    public Reservation(UUID id,
                       Date dateReservation,
                       StatutReservation statut,
                       Utilisateur utilisateur,
                       Document document) {

        this.id = id;
        this.dateReservation = dateReservation;
        this.statut = statut;
        this.utilisateur = utilisateur;
        this.document = document;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public StatutReservation getStatut() {
        return statut;
    }

    public void setStatut(StatutReservation statut) {
        this.statut = statut;
    }
}