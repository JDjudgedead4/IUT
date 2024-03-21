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
package optimisateuratelier.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import optimisateuratelier.atelier.AtelierSimple;
import optimisateuratelier.atelier.Chaine;
import optimisateuratelier.atelier.ChaineImpl;
import optimisateuratelier.atelier.Poste;
import optimisateuratelier.atelier.PosteImpl;

/**
 *
 * @author Rémi Venant
 */
public class GenerateurAtelier {

    /**
     * Créer un atelier de 2 chaines composées de nbPostes pour chacunes d'entre
     * elles, avec des temps de traitement, d'entrée, de sortie et de changement
     * calculés aléatoirement entre min et max.
     *
     * @param nbPostes le nombre de postes
     * @param min la borne inférieure d'un temps
     * @param max la borne supérieure d'un temps
     * @return l'atelier
     */
    public static AtelierSimple genererAtelierSimpleAleatoire(int nbPostes, int min, int max) {
        final Chaine c0 = genererChaineAleatoire(nbPostes, min, max);
        final Chaine c1 = genererChaineAleatoire(nbPostes, min, max);

        final int[] tempsChangement0a1 = GenerateurTemps.generateRandomSequence(
                nbPostes - 1, min, max);
        final int[] tempsChangement1a0 = GenerateurTemps.generateRandomSequence(
                nbPostes - 1, min, max);
        return new AtelierSimple(c0, c1, tempsChangement0a1, tempsChangement1a0);
    }

    /**
     * Créer une chaîne composée de nbPostes, avec des temps de traitement,
     * d'entrée et de sortie calculés aléatoirement entre min et max.
     *
     * @param nbPostes le nombre de postes
     * @param min la borne inférieure d'un temps
     * @param max la borne supérieure d'un temps
     * @return la chaîne
     */
    public static Chaine genererChaineAleatoire(int nbPostes, int min, int max) {
        final List<Poste> postesChaine = Arrays.stream(
                GenerateurTemps.generateRandomSequence(nbPostes, min, max))
                .mapToObj(t -> new PosteImpl(t))
                .collect(Collectors.toList());
        return new ChaineImpl(new ArrayList<>(postesChaine),
                GenerateurTemps.generateRandomValue(min, max),
                GenerateurTemps.generateRandomValue(min, max));
    }
}
