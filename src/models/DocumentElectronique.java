package models;

public class DocumentElectronique extends Document {
    private String format;
    private double tailleFichier; // en Mo
    private String url;

    public DocumentElectronique(int idDocument, String titre, String auteur, String langue, String categorie,
            boolean disponibles, String format, double tailleFichier, String url) {
        super(idDocument, titre, auteur, null);
        this.format = format;
        this.tailleFichier = tailleFichier;
        this.url = url;
    }

    @Override
    public void afficherInformations() {
       System.out.println("Format: " + format);
        System.out.println("Taille du Fichier: " + tailleFichier + " Mo");
        System.out.println("URL: " + url);
    }

    @Override
    public void afficherType() {
        System.out.println("Document Électronique");
    }
    
}
