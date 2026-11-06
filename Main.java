import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        // Recuperation du nom du joueur 1
        
        System.out.println("Joueur1 accouche ton nom");
        String nom1 = sc.next();
        System.out.println("Bro ton prenom");
        String prenom1 = sc.next();

        Joueur joueur1 = new Joueur(nom1, prenom1, "vert");
        
        // Recuperation du nom du joueur 2

        System.out.println("Joueur2 accouche ton nom");
        String nom2 = sc.next();
        System.out.println("Bro ton prenom");
        String prenom2 = sc.next();

        Joueur joueur2 = new Joueur(nom2, prenom2, "rouge");

        // Decleration d'un Terrain

        Terrain terrain = new Terrain();

        // Declaration du Jeu

        Jeu jeu = new Jeu(joueur1, joueur2, terrain);
    }
}
