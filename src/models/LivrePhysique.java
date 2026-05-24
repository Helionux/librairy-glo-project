package models;

import models.Interfaces.Empruntable;

public class LivrePhysique
        extends Document
        implements Empruntable {

    private String isbn;
    private int nbPages;

    public LivrePhysique(
            int id,
            String titre,
            String auteur,
            java.util.Date date,
            String isbn,
            int nbPages) {

        super(id,
                titre,
                auteur,
                date);

        this.isbn = isbn;
        this.nbPages = nbPages;
    }

    @Override
    public void emprunter(Utilisateur utilisateur) {

        System.out.println(
                "Livre emprunté par "
                        + utilisateur.getNom());
    }

    @Override
    public void retourner() {

        System.out.println(
                "Livre retourné");
    }

    @Override
    public void afficherType() {

        System.out.println(
                "Livre physique");
    }

    @Override
    public void afficherInformations() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'afficherInformations'");
    }
}