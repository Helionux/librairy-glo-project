package models.Interfaces;

public interface Authentifiable {
    boolean seConnecter(String email, String motDePasse);

    String getNom();
}
