<h1 align="center">Puissance 4</h1>

<p align="center">
  <em>Un jeu de Puissance 4 en Java, pensé pour l'apprentissage de la programmation orientée objet.</em>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/POO-6A1B9A?style=for-the-badge&logo=codeforces&logoColor=white" />
  <img src="https://img.shields.io/badge/ALGO-FF00FF?style=for-the-badge&logo=codeforces&logoColor=white" />
  <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white" />
  <img src="https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black" />
  <img src="https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white" />
  <img src="https://img.shields.io/badge/macOS-000000?style=for-the-badge&logo=apple&logoColor=white" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/statut-en_développement-yellow?style=flat-square" />
  <img src="https://img.shields.io/badge/version-0.1-blue?style=flat-square" />
  <img src="https://img.shields.io/badge/licence-MIT-green?style=flat-square" />
</p>

---

## À propos

**Puissance 4** est un projet académique développé en Java dans le cadre du cours de programmation de **l'ESGIS Bénin**, promotion **L2IRT**, **Groupe 5**. Il met en pratique les bases de la programmation orientée objet : classes, encapsulation, constructeurs, héritage de concepts et manipulation de tableaux multidimensionnels.

Le projet est actuellement en cours de développement. La structure de base (joueurs, terrain, positions, jeu) est en place et sert de fondation au futur moteur de jeu.

## Fonctionnalités

- [x] Modélisation d'un **joueur** (nom, prénom, couleur)
- [x] Modélisation d'un **terrain** de 6 lignes sur 7 colonnes
- [x] Représentation des **positions** sur la grille
- [x] Classe **Jeu** reliant joueurs et terrain
- [ ] Saisie interactive des noms de joueurs
- [ ] Boucle de jeu et alternance des tours
- [ ] Vérification des victoires (lignes, colonnes, diagonales)
- [ ] Détection du match nul
- [ ] Affichage de la grille dans le terminal

## Structure du projet

| Fichier | Rôle |
| --- | --- |
| `Main.java` | Point d'entrée de l'application, saisie des joueurs |
| `Joueur.java` | Représente un joueur et sa couleur de pion |
| `Terrain.java` | Gère la grille de jeu et ses dimensions |
| `Position.java` | Définit une case du terrain (abscisse, ordonnée, couleur) |
| `Jeu.java` | Orchestre le déroulement d'une partie |

## Prérequis

- **Java** 8 ou supérieur (JDK)
- Un terminal ou un IDE Java (IntelliJ IDEA, Eclipse, VS Code)

## Installation et exécution

```bash
git clone git@github.com:nyx-deb/puissance4.git
cd puissance4

javac *.java
java Main
```

Exemple de déroulement au lancement :

```text
Joueur1 accouche ton nom
Dupont
Bro ton prenom
Jean
Joueur2 accouche ton nom
Martin
Bro ton prenom
Sophie
```

## Pistes d'amélioration

- Rendre la grille dynamique selon les dimensions du terrain
- Ajouter un mode joueur contre ordinateur
- Séparer la logique métier de l'affichage (architecture MVC)
- Écrire des tests unitaires avec JUnit

## Contexte académique

| | |
| --- | --- |
| **Établissement** | ESGIS Bénin |
| **Filière** | Licence 2 Informatique et Réseaux de Télécommunications (L2IRT) |
| **Groupe** | Groupe 5 |
| **Cadre** | Projet de cours de programmation Java |

## Auteur

- **nyx-deb** - [github.com/nyx-deb](https://github.com/nyx-deb)

## Licence

Ce projet est distribué sous licence MIT. Voir le fichier `LICENSE` pour plus d'informations.
