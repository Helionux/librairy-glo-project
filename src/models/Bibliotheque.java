ghupackage models;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    private String nom;

    private List<Document> documents =
            new ArrayList<>();

    private List<Utilisateur>
            utilisateurs =
            new ArrayList<>();

    private List<Bibliotheque>
            partenaires =
            new ArrayList<>();

    public Bibliotheque(
            String nom) {

        this.nom = nom;
    }

    public void ajouterDocument(
            Document d) {

        documents.add(d);
    }

    public void ajouterPartenaire(
            Bibliotheque b) {

        partenaires.add(b);
    }
}