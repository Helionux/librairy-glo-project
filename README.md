# 📚 Système de Gestion de Bibliothèque Interconnectée

Ce projet a pour objectif de concevoir et de développer un système informatique moderne pour la gestion d'une bibliothèque. Face à la diversité des formats de documents actuels (physiques, numériques, audio, vidéo) et à la nécessité de collaborer avec des bibliothèques partenaires, cette application centralise la gestion des flux documentaires, des utilisateurs et des prêts inter-bibliothèques.

---

## 👥 Membres de l'équipe
*Ajoutez la liste des membres du projet ci-dessous :*
* **Nom Prénom** - [@PseudoGitHub](https://github.com/...) - Rôle / Responsabilité
* **Nom Prénom** - [@PseudoGitHub](https://github.com/...) - Rôle / Responsabilité
* **Nom Prénom** - [@PseudoGitHub](https://github.com/...) - Rôle / Responsabilité

---

## 🚀 Fonctionnalités Principales

* **Gestion Multi-formats :** Prise en charge de divers types d'ouvrages : documents physiques, électroniques (e-books, PDF), vidéos et audios.
* **Gestion des Utilisateurs :** Contrôle d'accès basé sur les rôles (RABAC) distinguant les simples utilisateurs (lecteurs), les rédacteurs et les administrateurs.
* **Réseau Inter-Bibliothèques :** Module d'échange permettant de commander et d'emprunter des documents situés dans des bibliothèques partenaires.
* **Suivi des Emprunts :** Gestion automatisée des dates limites, des prolongations et des alertes de retard.

---

## 🛠️ Architecture et Conception (UML)

Le projet s'appuie sur une conception orientée objet rigoureuse formalisée par des diagrammes UML. 

### Principales Classes Identifiées :
* `Document` (Classe abstraite) : Spécifiée en `LivrePhysique`, `DocumentNumerique`, `Video`, `Audio`.
* `Utilisateur` (Classe abstraite) : Spécifiée selon les rôles (`Lecteur`, `Administrateur`, `Redacteur`).
* `Bibliotheque` : Gère son propre catalogue et ses relations avec les `BibliothequePartenaire`.
* `Emprunt` / `Commande` : Classes d'association gérant les flux de documents en local ou en réseau.

> 💡 *Note : Les diagrammes de classes UML complets sont disponibles dans le dossier `/design` de ce dépôt.*

---

## 💻 Technologies Utilisées

* **Langage :** Java (Version 17 ou supérieure)
* **Conception :** UML 2.0
* **Gestionnaire de dépendances :** Maven / Gradle *(à ajuster selon ton choix)*
* **Versionnage :** Git & GitHub

---

## 📂 Structure du Projet

```text
├── design/             # Diagrammes UML (Classes, Cas d'utilisation)
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── bibliotheque/
│   │               ├── model/       # Classes métiers (Document, Utilisateur, etc.)
│   │               ├── service/     # Logique de gestion (Prêts, Échanges inter-Bibiothèques)
│   │               └── App.java     # Point d'entrée de l'application
│   └── test/                        # Tests unitaires
├── README.md
└── pom.xml             # Si utilisation de Maven