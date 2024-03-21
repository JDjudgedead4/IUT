/*
 * Copyright (C) 2022 IUT Laval - Le Mans Université.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package optimisateuratelier;

import optimisateuratelier.atelier.AtelierSimple;
import optimisateuratelier.optimisation.OptimisateurAtelierSimple;
import optimisateuratelier.optimisation.ResultatOptimisation;
import optimisateuratelier.utils.GenerateurAtelier;

/**
 *
 * @author Rémi Venant
 */
public class OptimisateurAtelierDemo {

    public static void printReport(ResultatOptimisation ro, long optimisationLengthTime) {
        System.out.println("Durée de l'opti (en ms) : " + optimisationLengthTime);
        System.out.println("Temps min de traitement de l'atelier : " + ro.getTempsTotal());
        System.out.println("Enchainement des postes entre chaine : " + ro.getChaineParPoste().toString());
    }

    public static void demoOptimisateurSimple() {
        try {
            final int nbPostes = 10000; // Nombre de postes de chaque chaîne
            // Génère aléatoirement l'atelier avec des temps de traitements pour chaque poste 
            // alétoires entre 1 et 20 secondes
            final AtelierSimple atelier = GenerateurAtelier.genererAtelierSimpleAleatoire(nbPostes, 1, 20);

            // Creer l'optimisateur d'atelier
            final OptimisateurAtelierSimple optimisateur = new OptimisateurAtelierSimple();

            System.out.println("Début Optimisation de l'atelier simple...");
            final long startTime = System.nanoTime();
            ResultatOptimisation ro = optimisateur.optimiserAtelier(atelier);
            long lengthTime = System.nanoTime();
            lengthTime = Math.floorDiv(lengthTime - startTime, 1000000);
            System.out.println("Fin Optimisation de l'atelier simple.");
            printReport(ro, lengthTime);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Impossible de faire la démonstration de l'optimisateur simple : " + ex.getMessage());
            System.out.println("Details de l'erreur ci-dessus");

        }
    }

    public static void demoOptimisateurSimple2() {
        try {
            final int nbPostes = 20; // Nombre de postes de chaque chaîne
            // Génère aléatoirement l'atelier avec des temps de traitements pour chaque poste 
            // alétoires entre 1 et 20 secondes
            final AtelierSimple atelier = GenerateurAtelier.genererAtelierSimpleAleatoire(nbPostes, 1, 20);

            // Creer l'optimisateur d'atelier
            final OptimisateurAtelierSimple optimisateur = new OptimisateurAtelierSimple();

            System.out.println("Début Optimisation de l'atelier complexe...");
            final long startTime = System.nanoTime();
            ResultatOptimisation ro = optimisateur.optimiserAtelier(atelier);
            long lengthTime = System.nanoTime();
            lengthTime = Math.floorDiv(lengthTime - startTime, 1000000);
            System.out.println("Fin Optimisation de l'atelier complexe.");
            printReport(ro, lengthTime);

            System.out.println("Structure de l'atelier complexe");
            System.out.println("CHAINES");
            atelier.printTempsChainesPostes();
            System.out.println("CHANGEMENTS");
            atelier.printTempsChangementToString();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Impossible de faire la démonstration de l'optimisateur simple : " + ex.getMessage());
            System.out.println("Details de l'erreur ci-dessus");

        }
    }

    public static void main(String[] args) {
        System.out.println("*******************************************************");
        System.out.println("**  Demonstration : optimisateur d'atelier simple    **");
        System.out.println("*******************************************************");
        demoOptimisateurSimple();

        System.out.println("*******************************************************");
        System.out.println("**  Demonstration : optimisateur d'atelier simple 2  **");
        System.out.println("*******************************************************");
        demoOptimisateurSimple2();

        System.out.println("Et voila !");
    }
}
