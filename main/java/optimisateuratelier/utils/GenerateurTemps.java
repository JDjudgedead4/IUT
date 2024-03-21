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

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Rémi Venant
 */
public class GenerateurTemps {

    /**
     * Génère une valeur entière alétoire comprise entre min (inclue) et max
     * (inclue)
     *
     * @param min valeur minimale (inclue)
     * @param max valeur maximale (inclue)
     * @return valeur aleatoire
     */
    public static Integer generateRandomValue(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    /**
     * Génère une séquence de valeurs entière alétoires uniformément réparties
     * dont chaque valeur est comprise entre min (inclue) et max (exclue).
     *
     * @param nbValues nombre de valeurs
     * @param min valeur minimale (incluse)
     * @param max valeur maximale (exclue)
     * @return
     */
    public static int[] generateRandomSequence(int nbValues, int min, int max) {
        if (nbValues <= 0) {
            throw new IllegalArgumentException("Number of values must be higher than 0");
        }
        if (min <= 0 || min > max) {
            throw new IllegalArgumentException("Minium value must be higher or equal to 0 and lower or equal to max");
        }
        final int[] values = new int[nbValues];
        Arrays.parallelSetAll(values, i -> generateRandomValue(min, max));
        return values;
    }

    /**
     * Génère une séquence de valeurs entière alétoires uniformément réparties
     * dont chaque valeur est comprise entre min (inclue) et max (exclue) dans
     * un tableau de taille déjà définie.
     *
     * @param values tableau de valeur, de taille initialisé
     * @param min valeur minimale (incluse)
     * @param max valeur maximale (exclue)
     * @return
     */
    public static int[] generateRandomSequence(int[] values, int min, int max) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Number of values must be higher than 0");
        }
        if (min <= 0 || min > max) {
            throw new IllegalArgumentException("Minium value must be higher or equal to 0 and lower or equal to max");
        }
        Arrays.parallelSetAll(values, i -> generateRandomValue(min, max));
        return values;
    }
}
