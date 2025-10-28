# README

## Description

Ce projet montre l'utilisation de Spring Core, Spring Data JPA et Spring MVC pour développer une application complète.

---

## Étapes de configuration

### 1. Spring Core
- **IoC (Inversion of Control)** : Spring gère la création et le cycle de vie des objets (beans).
- **Beans** : Définition des beans via annotations (`@Component`, `@Service`, `@Repository`) ou fichier de configuration Java/XML.
- **Injection de dépendances** : Utilisation de `@Autowired` ou constructeur pour injecter les dépendances nécessaires.
- **Configuration** : Classes annotées avec `@Configuration` et méthodes annotées avec `@Bean` pour déclarer des beans personnalisés.

### 2. Spring Data JPA
- **Persistance** : Gestion des entités et des opérations CRUD via des repositories.
- **Transactions** : Gestion automatique des transactions via `@Transactional`.
- **Repository** : Interfaces étendant `JpaRepository` pour simplifier l’accès aux données.

### 3. Spring MVC
- **Contrôleurs** : Création des controllers avec `@Controller` ou `@RestController`.
- **DispatcherServlet** : Point d’entrée central qui reçoit les requêtes HTTP et les distribue aux handlers appropriés.
- **WebAppInitializer** : Configuration programmatique du contexte Spring et du DispatcherServlet, remplaçant le fichier `web.xml`.

---

## Schéma de l’architecture Spring

```text
+-------------------+
|  Client / Browser |
+--------+----------+
         |
         v
+-------------------+
| DispatcherServlet |
+--------+----------+
         |
         v
+-------------------+       +-------------------+
|   Controller(s)   |<----->| Service / Business|
+--------+----------+       +-------------------+
         |
         v
+-------------------+
| Repository / JPA  |
+--------+----------+
         |
         v
+-------------------+
|  Database (MySQL) |
+-------------------+
