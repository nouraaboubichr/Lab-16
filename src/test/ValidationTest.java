/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.example.annotations.validation.Utilisateur;
import com.example.annotations.validation.Validateur;
import java.util.List;

/**
 *
 * @author hp
 */
public class ValidationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utilisateur utilisateurValide = new Utilisateur("John Doe", "john.doe@example.com", 30);
        List<String> erreursValide = Validateur.valider(utilisateurValide);

        System.out.println("Validation de l'utilisateur valide:");
        if (erreursValide.isEmpty()) {
            System.out.println("Aucune erreur trouvée");
        } else {
            for (String erreur : erreursValide) {
                System.out.println("- " + erreur);
            }
        }

        Utilisateur utilisateurInvalide = new Utilisateur("Jo", null, 15);
        List<String> erreursInvalide = Validateur.valider(utilisateurInvalide);

        System.out.println("\nValidation de l'utilisateur invalide:");
        if (erreursInvalide.isEmpty()) {
            System.out.println("Aucune erreur trouvée");
        } else {
            for (String erreur : erreursInvalide) {
                System.out.println("- " + erreur);
            }
        }
    }
    
}
