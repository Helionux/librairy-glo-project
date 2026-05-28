import enums.RoleUtilisateur;

public class Utilisateur {

    private String userId;
    private String nom;
    private String prenom;
    private String adresse;
    private String contact;
    private RoleUtilisateur role;

    public Utilisateur() {
    }

    public Utilisateur(String userId, String nom, String prenom,
                       String adresse, String contact,
                       enums.RoleUtilisateur role) {
        this.userId = userId;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.contact = contact;
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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

    public RoleUtilisateur getRole() {
        return role;
    }

    public void setRole(RoleUtilisateur role) {
        this.role = role;
    }
}