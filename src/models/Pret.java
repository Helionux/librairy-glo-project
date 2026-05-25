
import java.util.Date;

public class Pret {

    private String pretId;
    private Date dateEmprunt;
    private Date dateRetourPrevu;
    private Date dateRetourReel;

    private Utilisateur utilisateur;
    private Document document;

    public Pret() {
    }

    public Pret(String pretId,
                Date dateEmprunt,
                Date dateRetourPrevu,
                Date dateRetourReel,
                Utilisateur utilisateur,
                Document document) {

        this.pretId = pretId;
        this.dateEmprunt = dateEmprunt;
        this.dateRetourPrevu = dateRetourPrevu;
        this.dateRetourReel = dateRetourReel;
        this.utilisateur = utilisateur;
        this.document = document;
    }

    public String getPretId() {
        return pretId;
    }

    public void setPretId(String pretId) {
        this.pretId = pretId;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Date getDateRetourPrevu() {
        return dateRetourPrevu;
    }

    public void setDateRetourPrevu(Date dateRetourPrevu) {
        this.dateRetourPrevu = dateRetourPrevu;
    }

    public Date getDateRetourReel() {
        return dateRetourReel;
    }

    public void setDateRetourReel(Date dateRetourReel) {
        this.dateRetourReel = dateRetourReel;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}