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

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Rémi Venant
 */
public class ChaineImpl implements Chaine {

    private int tempsEntree;
    private int tempsSortie;
    private final ArrayList<Poste> postes;

    public ChaineImpl(ArrayList<Poste> postes, int tempsEntree, int tempsSortie) {
        if (postes == null || postes.isEmpty()) {
            throw new IllegalArgumentException("Une chaine doit avoir au moins un poste");
        }
        if (tempsEntree < 0 || tempsSortie < 0) {
            throw new IllegalArgumentException("Le temps d'entrée ou de sortie d'une chaine doit être positif ou nul");
        }
        this.postes = postes;
        this.tempsEntree = tempsEntree;
        this.tempsSortie = tempsSortie;
    }

    @Override
    public int getLongueur() {
        return this.postes.size();
    }

    @Override
    public int getTempsEntree() {
        return this.tempsEntree;
    }

    public void setTempsEntree(int tempsEntree) {
        this.tempsEntree = tempsEntree;
    }

    @Override
    public int getTempsSortie() {
        return this.tempsSortie;
    }

    public void setTempsSortie(int tempsSortie) {
        this.tempsSortie = tempsSortie;
    }

    @Override
    public Poste getPoste(int i) {
        return this.postes.get(i);
    }

    @Override
    public Iterator<Poste> postesIterator() {
        return this.postes.iterator();
    }

    @Override
    public String toString() {
        return "ChaineImpl{\n" + "tempsEntree=" + tempsEntree + "\n, tempsSortie=" + tempsSortie + "\n, postes=" + postes + '}';
    }
    
    

}
