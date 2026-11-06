public class Terrain {
    private int lignes = 6;
    private int colonnes = 7;

    private Position[][] positions;

    public Terrain(int lignes, int colonnes) {
        this.lignes = lignes;
        this.colonnes = colonnes;
        for (int x = 0; x < lignes; x++ ) {
            for (int y = 0; y < colonnes; y++) {
                positions[x][y] = new Position(x,y);
            }
        }
    }

        public Terrain() {
        for (int x = 0; x < lignes; x++ ) {
            for (int y = 0; y < colonnes; y++) {
                positions[x][y] = new Position(x,y);
            }
        }
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
