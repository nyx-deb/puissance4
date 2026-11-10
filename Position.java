public class Position {

    private static final String COULEUR_VIDE = "vide";

    private int abscisse;
    private int ordonnee;
    private String couleur;

    public Position(String couleur) {
        this(0, 0, couleur);
    }

    public Position(int abscisse, int ordonnee) {
        this(abscisse, ordonnee, COULEUR_VIDE);
    }

    public Position(int abscisse, int ordonnee, String couleur) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.couleur = couleur;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
