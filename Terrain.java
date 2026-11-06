public class Terrain {
    private int lignes;
    private int colonnes;

    public Terrain() {
        this(6, 7);
    }

    public Terrain(int lignes, int colonnes) {
        this.lignes = lignes;
        this.colonnes = colonnes;
    }

    public int getLignes() {
        return lignes;
    }

    public void setLignes(int lignes) {
        this.lignes = lignes;
    }

    public int getColonnes() {
        return colonnes;
    }

    public void setColonnes(int colonnes) {
        this.colonnes = colonnes;
    }
}
