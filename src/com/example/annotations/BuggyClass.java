/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.annotations;

/**
 *
 * @author hp
 */

@Bug(id = 1001, description = "Erreur d'affichage", status = "FIXED")
@Bug(id = 1002, description = "Problème de performance")
public class BuggyClass {

    public void methode() {
        System.out.println("Méthode avec des bugs connus");
    }

    public static void main(String[] args) {
        AnnotationProcessor.processClassWithBugs(BuggyClass.class);
    }
}
