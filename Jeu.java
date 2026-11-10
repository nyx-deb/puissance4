import java.util.Scanner;

public class Jeu {
    private Joueur joueur1;
    private Joueur joueur2;
    private Terrain terrain;
    private Joueur joueurCourant;
    private boolean terminee;

    public Jeu(Joueur joueur1, Joueur joueur2, Terrain terrain) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.terrain = terrain;
        this.joueurCourant = joueur1;
        this.terminee = false;
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

    public Joueur getJoueurCourant() {
        return joueurCourant;
    }

    public boolean estTerminee() {
        return terminee;
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

    public void lancer(Scanner scanner) {
        terrain.afficher();

        while (!terminee) {
            System.out.println();
            System.out.println("Au tour de " + joueurCourant.getPrenom() + " " + joueurCourant.getNom() + " (" + joueurCourant.getCouleur() + ")");
            System.out.print("Choisissez une colonne de 1 a " + terrain.getColonnes() + " : ");

            try {
                if (!scanner.hasNextInt()) {
                    String saisie = scanner.next();
                    throw new IllegalArgumentException("Saisie invalide : " + saisie + ". Entrez un nombre entre 1 et " + terrain.getColonnes());
                }

                int colonne = scanner.nextInt() - 1;
                if (jouerCoup(joueurCourant, colonne)) {
                    terrain.afficher();
                    System.out.println();
                    System.out.println("Bravo " + joueurCourant.getPrenom() + " " + joueurCourant.getNom() + " ! Vous avez gagne !");
                    terminee = true;
                    return;
                }

                if (terrain.estPleine()) {
                    terrain.afficher();
                    System.out.println();
                    System.out.println("Match nul ! La grille est pleine.");
                    terminee = true;
                    return;
                }

                passerTour();
                terrain.afficher();
            } catch (IllegalArgumentException e) {
                System.out.println("Erreur : " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

    private void passerTour() {
        joueurCourant = (joueurCourant == joueur1) ? joueur2 : joueur1;
    }
}