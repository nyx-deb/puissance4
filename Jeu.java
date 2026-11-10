public class Jeu {
    private Joueur joueur1;
    private Joueur joueur2;
    private Terrain terrain;

    public Jeu(Joueur joueur1, Joueur joueur2, Terrain terrain) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.terrain = terrain;
    }

    public Joueur getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    /**
     * Joue un coup : depose le pion du joueur dans la colonne (numerotee a partir de 0)
     * puis verifie si ce coup donne la victoire.
     *
     * @return true si le joueur vient de gagner, false sinon
     * @throws IllegalArgumentException si la colonne n'existe pas ou est pleine
     */
    public boolean jouerCoup(Joueur joueur, int colonne) {
        Position position = terrain.deposerPiece(colonne, joueur.getCouleur());
        if (position == null) {
            throw new IllegalArgumentException("Colonne invalide ou pleine : " + (colonne + 1));
        }
        return terrain.verifierVictoire(position);
    }
}