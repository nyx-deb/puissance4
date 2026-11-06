public class Joueur {
    private String nom;
    private String prenom;
    private String couleur;

    public Joueur(String nom, String prenom, String couleur) {
        this.nom = nom;
        this.prenom = prenom;
        this.couleur = couleur;
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

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
