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

/**
 *
 * @author Rémi Venant
 */
public interface Atelier {

    /**
     * Fournit le nombre de postes d'une chaine de l'atelier, toutes les chaînes ayant le même
     * nombre de poste.
     *
     * @return la longueur d'une chaine
     */
    int getLongueurChaines();

    /**
     * Fournit le nombre de chaînes de l'atelier.
     *
     * @return le nombre de chaînes
     */
    int getNbChaines();

    /**
     * Retourne la chaîne d'indice i.
     *
     * @param i indice de la chaîne @return la chaîne d'indice i
     * @return la chaine
     * @throws IndexOutOfBoundsException si i n'est pas un indice valide.
     */
    Chaine getChaine(int i);

    /**
     * Donne le temps de changement du poste d'indice indicePosteDepart de la chaîne d'indice
     * indiceChaineA vers le poste d'indice indicePosteDepart + 1 de la chaîne d'indice
     * indiceChaineB.
     *
     * @param indiceChaineA l'indice de la chaîne de départ
     * @param indiceChaineB l'indice de la chaîne de d'arrivée
     * @param indicePosteDepart l'indice du poste de départ
     * @return le temps de changement en secondes.
     */
    int getTempsChangement(int indiceChaineA, int indiceChaineB, int indicePosteDepart);
}
