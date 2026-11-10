<div align="center">

# Puissance 4

**Un jeu de Puissance 4 en Java, pensé pour l'apprentissage de la programmation orientée objet.**

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![POO](https://img.shields.io/badge/POO-6A1B9A?style=for-the-badge&logo=codeforces&logoColor=white)](#)
[![ALGO](https://img.shields.io/badge/ALGO-FF00FF?style=for-the-badge&logo=codeforces&logoColor=white)](#)
[![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)](https://git-scm.com/)
[![Linux](https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)](#)
[![Windows](https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)](#)
[![macOS](https://img.shields.io/badge/macOS-000000?style=for-the-badge&logo=apple&logoColor=white)](#)

[![Statut](https://img.shields.io/badge/statut-en_développement-yellow?style=flat-square)](#état-du-projet)
[![Version](https://img.shields.io/badge/version-0.1-blue?style=flat-square)](#)
[![Licence](https://img.shields.io/badge/licence-MIT-green?style=flat-square)](LICENSE)
[![Dernier commit](https://img.shields.io/github/last-commit/nyx-deb/puissance4?style=flat-square&label=dernier%20commit)](https://github.com/nyx-deb/puissance4/commits/main)

</div>

---

> **Projet en cours de développement**
> Ce projet n'est pas encore terminé. De nouvelles fonctionnalités et améliorations seront ajoutées progressivement. La version actuelle pose les fondations du jeu.

## Sommaire

- [À propos](#à-propos)
- [Aperçu](#aperçu)
- [État du projet](#état-du-projet)
- [Structure du projet](#structure-du-projet)
- [Installation et exécution](#installation-et-exécution)
- [Améliorations prévues](#améliorations-prévues)
- [Contexte académique](#contexte-académique)
- [Licence](#licence)

## À propos

**Puissance 4** est un projet académique développé en Java dans le cadre du cours de programmation de **l'ESGIS Bénin**, promotion **L2IRT**, **Groupe 5**.

Il met en pratique les fondamentaux de la programmation orientée objet : classes, encapsulation, constructeurs, composition et manipulation de tableaux multidimensionnels. L'objectif est de construire progressivement un jeu complet et fonctionnel.

## Aperçu

```text
  1   2   3   4   5   6   7
+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+
|   |   |   | O |   |   |   |
+---+---+---+---+---+---+---+
|   |   | O | X |   |   |   |
+---+---+---+---+---+---+---+
|   | X | O | X | O |   |   |
+---+---+---+---+---+---+---+
        ^
      colonne
```

## État du projet

Le projet est en **développement actif**. Les éléments ci-dessous indiquent ce qui est déjà en place et ce qui reste à implémenter.

| Fonctionnalité | État |
| --- | :---: |
| Modélisation du joueur (nom, prénom, couleur) | Terminé |
| Terrain de 6 lignes sur 7 colonnes | Terminé |
| Représentation des positions sur la grille | Terminé |
| Classe `Jeu` reliant joueurs et terrain | Terminé |
| Saisie interactive des noms de joueurs | Terminé |
| Boucle de jeu et alternance des tours | À venir |
| Vérification des victoires et du match nul | À venir |
| Affichage de la grille dans le terminal | À venir |
| Mode joueur contre ordinateur | À venir |

## Structure du projet

```text
puissance4/
├── Main.java       Point d'entrée, saisie des joueurs
├── Joueur.java     Joueur et couleur de pion
├── Terrain.java    Grille de jeu et dimensions
├── Position.java   Case du terrain (abscisse, ordonnée, couleur)
├── Jeu.java        Orchestration d'une partie
├── README.md       Documentation du projet
├── CHANGELOG.md    Historique des modifications
└── LICENSE         Licence MIT
```

<details>
<summary><strong>Détail des classes</strong></summary>

| Fichier | Rôle |
| --- | --- |
| `Main.java` | Point d'entrée de l'application, saisie des joueurs |
| `Joueur.java` | Représente un joueur et sa couleur de pion |
| `Terrain.java` | Gère la grille de jeu et ses dimensions |
| `Position.java` | Définit une case du terrain (abscisse, ordonnée, couleur) |
| `Jeu.java` | Orchestre le déroulement d'une partie |

</details>

## Installation et exécution

### Prérequis

- **Java** 8 ou supérieur (JDK)
- Un terminal ou un IDE Java (IntelliJ IDEA, Eclipse, VS Code)

### Lancement

```bash
git clone git@github.com:nyx-deb/puissance4.git
cd puissance4

javac *.java
java Main
```

### Exemple

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

## Améliorations prévues

Le projet évoluera encore. Voici les améliorations envisagées :

- Finaliser la boucle de jeu et l'alternance des tours
- Implémenter la détection des victoires et du match nul
- Ajouter un affichage soigné de la grille dans le terminal
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

Ce projet est distribué sous licence **MIT**. Voir le fichier [LICENSE](LICENSE) pour plus d'informations.

<div align="center">

---

Réalisé dans le cadre du cours de programmation Java à l'ESGIS Bénin

</div>
