public class Terrain {
    private int lignes = 6;
    private int colonnes = 7;

    private Position[][] positions;

    public Terrain(int lignes, int colonnes) {
        this.lignes = lignes;
        this.colonnes = colonnes;
        initialiserPositions();
    }

    public Terrain() {
        initialiserPositions();
    }

    // Cree le tableau et remplit chaque case avec une position vide
    private void initialiserPositions() {
        positions = new Position[lignes][colonnes];
        for (int x = 0; x < lignes; x++) {
            for (int y = 0; y < colonnes; y++) {
                positions[x][y] = new Position(x, y, null);
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

    // Retourne la position situee a (ligne, colonne), ou null si hors de la grille
    public Position getPosition(int ligne, int colonne) {
        if (!estDansLaGrille(ligne, colonne)) {
            return null;
        }
        return positions[ligne][colonne];
    }

    private boolean estDansLaGrille(int ligne, int colonne) {
        return ligne >= 0 && ligne < lignes && colonne >= 0 && colonne < colonnes;
    }

    /**
     * Fait tomber un pion dans la colonne donnee (numerotee a partir de 0).
     * Le pion se place sur la case libre la plus basse.
     *
     * @return la position ou le pion s'est arrete, ou null si la colonne
     *         n'existe pas ou est deja pleine
     */
    public Position deposerPiece(int colonne, String couleur) {
        if (colonne < 0 || colonne >= colonnes) {
            return null;
        }
        for (int x = lignes - 1; x >= 0; x--) {
            if (positions[x][colonne].estVide()) {
                positions[x][colonne].setCouleur(couleur);
                return positions[x][colonne];
            }
        }
        return null; // colonne pleine
    }

    /**
     * Verifie si le pion qui vient d'etre depose forme un alignement de 4.
     * On compte les pions de meme couleur dans les 4 directions
     * (horizontale, verticale, deux diagonales), de part et d'autre du pion.
     */
    public boolean verifierVictoire(Position derniere) {
        if (derniere == null || derniere.estVide()) {
            return false;
        }
        int[][] directions = { {0, 1}, {1, 0}, {1, 1}, {1, -1} };
        for (int[] d : directions) {
            int total = 1
                    + compterAlignes(derniere, d[0], d[1])
                    + compterAlignes(derniere, -d[0], -d[1]);
            if (total >= 4) {
                return true;
            }
        }
        return false;
    }

    // Compte les pions de meme couleur a partir de 'depart' (exclu) dans la direction (dx, dy)
    private int compterAlignes(Position depart, int dx, int dy) {
        String couleur = depart.getCouleur();
        int compte = 0;
        int x = depart.getAbscisse() + dx;
        int y = depart.getOrdonnee() + dy;
        while (estDansLaGrille(x, y) && couleur.equals(positions[x][y].getCouleur())) {
            compte++;
            x += dx;
            y += dy;
        }
        return compte;
    }

    // Affiche la grille dans le terminal (V = vert, R = rouge)
    public void afficher() {
        StringBuilder sb = new StringBuilder();

        // numeros de colonnes
        sb.append(" ");
        for (int y = 0; y < colonnes; y++) {
            sb.append("  ").append(y + 1).append(" ");
        }
        sb.append("\n");

        String separateur = separateur();
        sb.append(separateur);
        for (int x = 0; x < lignes; x++) {
            sb.append(" |");
            for (int y = 0; y < colonnes; y++) {
                sb.append(" ").append(symbole(positions[x][y])).append(" |");
            }
            sb.append("\n");
            sb.append(separateur);
        }
        System.out.print(sb);
    }

    private String separateur() {
        StringBuilder sb = new StringBuilder(" +");
        for (int y = 0; y < colonnes; y++) {
            sb.append("---+");
        }
        return sb.append("\n").toString();
    }

    private char symbole(Position p) {
        if (p.estVide()) {
            return ' ';
        }
        return Character.toUpperCase(p.getCouleur().charAt(0)); // "vert" -> V, "rouge" -> R
    }
}