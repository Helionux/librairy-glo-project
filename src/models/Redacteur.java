package models;

public class Redacteur extends Utilisateur {

    private String specialite;

    public Redacteur(
            int id,
            String nom,
            String prenom,
            String email,
            String specialite) {

        super(id, nom, prenom, email);

        this.specialite = specialite;
    }

    @Override
    public String getNom() {
        return super.getNom();
    }
    @Override
    public void afficherRole() {
        System.out.println(
                "Rédacteur");
    }
}