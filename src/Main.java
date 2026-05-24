

import models.Document;
import models.LivrePhysique;
import models.Video;

public class Main {

    public static void main(
            String[] args) {

        Document d1 =
                new LivrePhysique(
                        1,
                        "Java",
                        "Dupont",
                        new java.util.Date(),
                        "123",
                        300);

        Document d2 =
                new Video(
                        2,
                        "Cours UML",
                        "Martin",
                        new java.util.Date(),
                        120);

        d1.afficherType();
        d2.afficherType();
    }
}