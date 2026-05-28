

public class Document {

    private String documentId;
    private String titre;
    private TypeDocument type;
    private String auteur;
    private String isbn;
    private String isbn1;
    private boolean disponible;

    public Document() {
    }

    public Document(String documentId,
                    String titre,
                    TypeDocument type,
                    String auteur,
                    String isbn,
                    boolean disponible) {

        this.documentId = documentId;
        this.titre = titre;
        this.type = type;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public TypeDocument getType() {
        return type;
    }

    public void setType(TypeDocument type) {
        this.type = type;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
