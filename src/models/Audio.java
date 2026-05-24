package models;

public class Audio  extends DocumentElectronique {
    private int duree; 
    private String formatAudio;

    public Audio(int idDocument, String titre, String auteur, String langue, String categorie,
            boolean disponibles, String format, double tailleFichier, String url, int duree, String formatAudio) {
        super(idDocument, titre, auteur, langue, categorie, disponibles, format, tailleFichier, url);
        this.duree = duree;
        this.formatAudio = formatAudio;
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Durée: " + duree + " minutes");
        System.out.println("Format Audio: " + formatAudio);
    }
    
}
