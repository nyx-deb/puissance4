public class Terrain {
    private int lignes;
    private int colonnes;

    private Position[][] positions;

    public Terrain() {
        this(6, 7);
    }

    public Terrain(int lignes, int colonnes) {
        this.lignes = lignes;
        this.colonnes = colonnes;
        this.positions = new Position[lignes][colonnes];
        for (int x = 0; x < lignes; x++) {
            for (int y = 0; y < colonnes; y++) {
                positions[x][y] = new Position(x, y);
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

    public Position getPosition(int abscisse, int ordonnee) {
        return positions[abscisse][ordonnee];
    }

    public void setPosition(int abscisse, int ordonnee, Position position) {
        positions[abscisse][ordonnee] = position;
    }

    public Position[][] getPositions() {
        return positions;
    }
}
