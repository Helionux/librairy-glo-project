package models;

public class Video
        extends Document {

    private double duree;

    public Video(
            int id,
            String titre,
            String auteur,
            java.util.Date date,
            double duree) {

        super(id,
                titre,
                auteur,
                date);

        this.duree = duree;
    }

    @Override
    public void afficherType() {

        System.out.println(
                "Document vidéo");
    }

    @Override
    public void afficherInformations() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'afficherInformations'");
    }
}