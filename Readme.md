# Améliorations de l'application PayYouPayMe

Ce README documente les améliorations apportées à l'application PayYouPayMe dans le cadre de mon devoir.
 Les modifications suivantes ont été effectuées pour améliorer l'expérience utilisateur et administrateur ainsi que l'interface de l'application bancaire.

## Changements principaux

### 1. Suppression de l'attribut `login`
- Remplacement de `findAllByLogin` par `findAllByUsername` dans le `transactionRepository`.

### 2. Affichage du menu pour les administrateurs
- Le menu administrateur est désormais affiché sur les pages `home` et `admin`.

### 3. Accès aux pages basé sur les rôles
- Les utilisateurs avec le rôle `user` ont maintenant accès à toutes les pages sauf la page d'administration.

### 4. Validation de l'unicité du nom d'utilisateur
- Mise en place d'une vérification pour garantir que chaque nom d'utilisateur soit unique dans la base de données.

### 5. Affichage conditionnel du formulaire d'inscription
- Le formulaire d'inscription est affiché uniquement sur la page d'accueil si aucun utilisateur n'est connecté.

### 6. Nettoyage de l'interface du site web
- Nettoyage des pages HTML du site pour améliorer leur structure et leur lisibilité. Traduction de tout le texte de l'application en anglais.

### 7. Stylisation des pages utilisateur et administrateur
- Application d'un style cohérent sur les pages utilisateur et administrateur.

### 8. Réactivation de compte utilisateur
- Ajout de la fonctionnalité permettant aux utilisateurs de réactiver leur compte bancaire.

### 9. Signaler un problème avec une transaction
- Ajout de la fonctionnalité permettant de signaler un problème avec une transaction bancaire depuis la page de transaction.

### 10. Liens des pages selon les rôles des utilisateurs sur la page d'accueil
- Affichage de liens spécifiques vers les pages en fonction du rôle de l'utilisateur (Admin ou User) sur la page d'accueil.

