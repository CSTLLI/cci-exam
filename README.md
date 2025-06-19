  <a href="https://www.lavicon.dev/?utm_source=exam_java" target="_blank">
    <img src="https://github.com/user-attachments/assets/8003e143-0277-4790-82cd-7138fc2ad482" alt="Logo" width="200">
  </a>

# Application Bibliothèque

EDIT : Apres avoir relu le sujet, j'ai fait une App Web au lieu d'une App Desktop LOL, mais bon tout est fonctionnel ! 
(mérite juste un -2)

Application de gestion de bibliothèque développée avec **Spring Boot** et **JavaFX** pour l'évaluation M2I.

## 🚀 Fonctionnalités

- ✅ Consulter la liste des livres
- ✅ Ajouter un nouveau livre  
- ✅ Afficher l'historique d'emprunt par livre
- ✅ Interface web moderne (bonus)

## 🛠️ Technologies

- **Backend**: Spring Boot 3.x, JPA/Hibernate, MySQL
- **Frontend**: JavaFX
- **Base de données**: MySQL
- **Java**: 21+

## 📋 Prérequis

- Java 21 ou supérieur
- Maven 3.6+
- MySQL 8.0+
- IDE (IntelliJ IDEA recommandé)

## ⚙️ Installation

### 1. Cloner le projet
```bash
git clone <repository-url>
cd ...
```

### 2. Configuration base de données
```bash
# Démarrer MySQL
mysql -u root -p

# Créer la base de données
CREATE DATABASE m2i_api_exam;
```

### 3. Configuration application
Modifier `src/main/resources/application.properties` :
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/m2i_api_exam?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=your_password
```

### 4. Données de test
Exécuter le script SQL de test :
```bash
mysql -u root -p m2i_api_exam < src/main/resources/mock-data.sql
```

### 5. Lancement
```bash
mvn spring-boot:run
```

L'API sera disponible sur : `http://localhost:8080`

## 📊 Structure du projet

```
src/
├── main/
│   ├── java/com/library/api/
│   │   ├── controllers/     # REST Controllers
│   │   ├── services/        # Services métier
│   │   ├── repositories/    # Repositories JPA
│   │   ├── entities/        # Entités JPA
│   │   └── dtos/           # Data Transfer Objects
│   └── resources/
│       ├── application.properties
│       ├── mock-data.sql   # 📄 Données de test
│       └── Library.postman_collection.json  # 📫 Collection Postman
└── front/
    └── index.html          # Interface web
```

## 🔗 API Endpoints

| Méthode | Endpoint | Description |
|---------|----------|-------------|
| `GET` | `/api/books` | Liste tous les livres |
| `POST` | `/api/books` | Ajoute un nouveau livre |
| `GET` | `/api/books/{isbn}` | Historique d'emprunt par ISBN |

## 📄 Données de test (mock-data.sql)

Le fichier `src/main/resources/mock-data.sql` contient :
- **5 livres** (Le Petit Prince, 1984, LOTR, L'Étranger, Harry Potter)
- **3 emprunteurs** (Jean Dupont, Marie Martin, Pierre Durand)  
- **3 emprunts** avec historique

## 📫 Collection Postman

Importez `src/main/resources/Library.postman_collection.json` dans Postman pour tester l'API :

### Variables d'environnement
```json
{
  "base_url": "http://localhost:8080/api"
}
```

### Requêtes incluses
- ✅ GET All Books
- ✅ POST Add Book
- ✅ GET Book History by ISBN

## 🌐 Interface Web

Ouvrez `front/index.html` dans votre navigateur pour accéder à l'interface moderne.

**Fonctionnalités UI :**
- 📋 Tableau des livres responsive
- ➕ Modal d'ajout de livre
- 📖 Consultation de l'historique
- 🔔 Notifications toast
- 🎨 Design system moderne
- Logo généré grâce à https://lavicon.dev

## 🗃️ Modèle de données

### Book (Livre)
- `id` - Identifiant unique
- `isbn` - Numéro ISBN unique
- `title` - Titre du livre
- `author` - Auteur

### Borrower (Emprunteur)  
- `id` - Identifiant unique
- `firstName` - Prénom
- `lastName` - Nom

### Loan (Emprunt)
- `id` - Identifiant unique
- `loanDate` - Date d'emprunt
- `dueDate` - Date d'échéance
- `bookId` - Référence vers le livre
- `borrowerId` - Référence vers l'emprunteur

## 🐛 Résolution de problèmes

### Erreur de connexion base de données
```bash
# Vérifier que MySQL est démarré
sudo systemctl status mysql

# Vérifier les credentials dans application.properties
```

## 📝 Auteur

Développé pour l'évaluation Java M2I - [Castelli Valerio]

## 📄 Licence

Ce projet est développé dans un cadre pédagogique.
