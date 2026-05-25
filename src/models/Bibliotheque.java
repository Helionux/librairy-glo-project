

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    private String bibliothequeId;
    private String nom;
    private String adresse;
    private String contact;

    private List<Document> documents;

    private List<Partenaire> partenaires;

    public Bibliotheque() {
        documents = new ArrayList<>();
        partenaires = new ArrayList<>();
    }

    public Bibliotheque(String bibliothequeId,
                        String nom,
                        String adresse,
                        String contact) {

        this.bibliothequeId = bibliothequeId;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;

        this.documents = new ArrayList<>();
        this.partenaires = new ArrayList<>();
    }

   
    public void ajouterDocument(Document document) {
        documents.add(document);
    }

    public void supprimerDocument(Document document) {
        documents.remove(document);
    }

    // ==========================
    // Gestion des partenaires
    // ==========================

    public void ajouterPartenaire(Partenaire partenaire) {
        partenaires.add(partenaire);
    }

    public void supprimerPartenaire(Partenaire partenaire) {
        partenaires.remove(partenaire);
    }

    // ==========================
    // Getters / Setters
    // ==========================

    public String getBibliothequeId() {
        return bibliothequeId;
    }

    public void setBibliothequeId(String bibliothequeId) {
        this.bibliothequeId = bibliothequeId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public List<Partenaire> getPartenaires() {
        return partenaires;
    }

    public void setPartenaires(List<Partenaire> partenaires) {
        this.partenaires = partenaires;
    }
}