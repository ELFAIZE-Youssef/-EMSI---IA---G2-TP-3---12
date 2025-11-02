Compte rendu  — TP3 REST avec JAX-RS et Gemini

Dans ce TP, j’ai développé une application REST en Jakarta EE (JAX-RS) permettant d’interagir avec un modèle d’intelligence artificielle (Gemini) à travers LangChain4j.
L’objectif était de comprendre comment exposer des endpoints REST JSON et d’intégrer une IA pour générer des réponses dynamiques.

L’application propose un endpoint /api/guide/lieu/{ville_ou_pays} qui retourne, au format JSON, les principaux endroits à visiter dans  un pays, ainsi que le prix moyen d’un repas local.
L’IA (Gemini) est configurée via LangChain4j et encapsulée dans une classe LlmClient, utilisant une interface GuideTouristique et un record InfosTouristiques pour structurer les réponses JSON.

J’ai également implémenté le bonus, en permettant à l’utilisateur de choisir le nombre d’endroits à visiter grâce au paramètre ?nb= dans l’URL :

http://localhost:8080/tp3-elfaize-1.0-SNAPSHOT/api/guide/lieu/Paris?nb=3


Exemple de réponse :

{
  "lieu": "Paris",
  "endroitsAVisiter": ["Tour Eiffel", "Musée du Louvre", "Montmartre"],
  "prixMoyenRepas": "20 EUR"
}


Ce TP m’a permis de :

comprendre la configuration et le déploiement d’une API REST Jakarta EE,

utiliser LangChain4j pour connecter une IA générative (Gemini) à un service REST,

produire et consommer des réponses structurées au format JSON,

gérer des paramètres dynamiques dans les endpoints REST.

ℹ️ Note : la dépendance langchain4j-easy-rag a été incluse par erreur dans les premiers commits mais retirée ensuite, car elle n’est pas utilisée dans ce TP.
