package models;

public class UtilisateurSimple
        extends Utilisateur {

    public UtilisateurSimple(
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
                "Utilisateur simple");
    }

    @Override
    public String getNom() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNom'");
    }
}