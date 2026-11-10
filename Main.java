import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Joueur 1 - Nom :");
        String nom1 = sc.next();
        System.out.println("Joueur 1 - Prénom :");
        String prenom1 = sc.next();

        System.out.println("Joueur 2 - Nom :");
        String nom2 = sc.next();
        System.out.println("Joueur 2 - Prénom :");
        String prenom2 = sc.next();

        Joueur joueur1 = new Joueur(nom1, prenom1, "vert");
        Joueur joueur2 = new Joueur(nom2, prenom2, "rouge");

        Terrain terrain = new Terrain();
        Jeu jeu = new Jeu(joueur1, joueur2, terrain);

        System.out.println("\n=== Debut de la partie ===\n");
        jeu.lancer(sc);

        sc.close();
    }
}
