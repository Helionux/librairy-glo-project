package models.Interfaces;

import models.Utilisateur;

public interface Empruntable {
    void emprunter(Utilisateur utilisateur);

    void retourner();
}
