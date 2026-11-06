public class Jeu {
    private Joueur joueur1;
    private Joueur joueur2;
    private Terrain terrain;

    public Jeu() {
        this.joueur1 = new Joueur();
        this.joueur2 = new Joueur();
        this.terrain = new Terrain();
    }

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
}
