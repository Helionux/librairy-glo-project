package models;

public class Administrateur
        extends Utilisateur {

    public Administrateur(
            int id,
            String nom,
            String email,
            String mdp) {

        super(id,
                nom,
                email,
                mdp);
    }

    @Override
    public void afficherRole() {

        System.out.println(
                "Administrateur");
    }

    public void ajouterDocument(
            Bibliotheque b,
            Document d) {

        b.ajouterDocument(d);
    }

    @Override
    public String getNom() {
        return super.getNom();
    }
}