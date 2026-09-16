# Exercice 1 - Création et utilisation des annotations

* Comprendre le concept et l’utilité des annotations en Java.
* Utiliser les annotations standard de Java.
* Créer des annotations personnalisées comme `@Author` et `@Version`.
* Appliquer les annotations aux classes et accéder à leurs informations avec la réflexion.

# Exercice 2 - Accès aux annotations par réflexion

* Créer une classe `AnnotationProcessor` pour traiter les annotations.
* Vérifier la présence de `@Author` et `@Version`.
* Récupérer et afficher les informations des annotations.
* Utiliser la réflexion pour récupérer toutes les annotations d’une classe.

# Exercice 3 - Annotations pour les méthodes

* Créer l’annotation `@MethodInfo` pour documenter les méthodes.
* Définir une description, des tags et une révision.
* Appliquer `@MethodInfo` aux méthodes de `AnnotatedClass`.
* Traiter les annotations des méthodes avec la réflexion.

# Exercice 4 - Annotations répétables

* Créer l’annotation répétable `@Bug`.
* Définir un identifiant, une description et un statut.
* Appliquer plusieurs annotations `@Bug` à une même classe.
* Utiliser `getAnnotationsByType()` pour récupérer et afficher les bugs.

# Exercice 5 - Annotations de validation

* Créer les annotations `@NotNull`, `@Length` et `@Range`.
* Appliquer ces annotations aux champs de la classe `Utilisateur`.
* Définir les règles de validation avec des valeurs minimales et maximales.
* Utiliser la réflexion pour lire les annotations et vérifier les champs.

# Exercice 6 - Création d’un validateur

* Créer la classe `Validateur` pour effectuer automatiquement les validations.
* Vérifier les valeurs `null` avec `@NotNull`.
* Vérifier la longueur des chaînes avec `@Length`.
* Vérifier les intervalles numériques avec `@Range`.
* Retourner une liste contenant les erreurs trouvées.

# Exercice 7 - Test de la validation

* Créer une classe `ValidationTest`.
* Tester un utilisateur valide avec des données correctes.
* Tester un utilisateur invalide avec des données incorrectes.
* Afficher les erreurs de validation détectées.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />
