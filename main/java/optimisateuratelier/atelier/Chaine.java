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
package optimisateuratelier.atelier;

import java.util.Iterator;

/**
 *
 * @author Rémi Venant
 */
public interface Chaine {

    /**
     * Fournit le nombre de poste de la chaîne.
     *
     * @return la longueur de la chaîne
     */
    int getLongueur();

    /**
     * Fournit le temps d'entrée sur la chaîne.
     *
     * @return le temps de d'entrée en secondes.
     */
    int getTempsEntree();

    /**
     * Fournit le temps de sortie de la chaîne.
     *
     * @return le temps de sortie en secondes.
     */
    int getTempsSortie();

    /**
     * Fournit le poste d'indice i de la chaîne.
     *
     * @param i l'indice du poste
     * @return le poste d'indice i
     */
    Poste getPoste(int i);

    /**
     * Fournit un itérateur sur les postes de la chaine.
     *
     * @return l'iterateur de postes
     */
    Iterator<Poste> postesIterator();
}
