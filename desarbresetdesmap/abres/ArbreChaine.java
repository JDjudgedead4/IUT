/*
 * Copyright (C) 2023 IUT Laval - Le Mans Université.
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
package desarbresetdesmap.abres;

import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Remi Venant
 * @param <V> type de valeurs de l'arbe
 */
public class ArbreChaine<V> implements Arbre<V> {
	private V valeurRacine;
    private List<Arbre<V>> foret;

    public ArbreChaine(V valeurRacine) {
        this.valeurRacine = valeurRacine;
    }

    public ArbreChaine(V valeurRacine, List<Arbre<V>> foret) {
        this(valeurRacine);
        this.foret = foret;
	    }

    @Override
    public V getRacine() {
    	return this.valeurRacine;
    }

    @Override
    public void setRacine(V valeur) {
    	
    	this.valeurRacine = valeur;
    }

    @Override
    public List<Arbre<V>> getForet() {
    	
    	return this.foret;
    }

    @Override
    public boolean isFeuille() {
    	
    	return (foret.isEmpty());
    }

    @Override
    public int getNbNoeuds() {
    	int nbNoeuds=1;
    	for (Arbre<V> sousArbre : foret) {
    		nbNoeuds += sousArbre.getNbNoeuds();
    	}
    	return nbNoeuds;
    }

    @Override
    public int getNbFeuilles() {
    	int nbFeuilles=0;
    	if (this.isFeuille()) {
    		nbFeuilles++;
    	}else {
    		for (Arbre<V> sousArbre : foret) {

        		nbFeuilles += sousArbre.getNbFeuilles();
    		}
    	}
    	return nbFeuilles;
    }

    @Override
    public int getHauteur() {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float getHauteurMoyenne() {
        int sommeHauteurs = 0;
        int nombreSousArbres = foret.size();
        
        if (nombreSousArbres == 0) {
            return 0.0f; // Si l'arbre est une feuille, la hauteur moyenne est 0.
        } else {
            for (Arbre<V> sousArbre : foret) {
                sommeHauteurs += sousArbre.getHauteur();
            }
            return (float)sommeHauteurs / nombreSousArbres;
        }
    }


    @Override
    public void traiterNoeudsParcoursPrefixe(Consumer<V> traitementNoeud) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void traiterNoeudsParcoursSuffixe(Consumer<V> traitementNoeud) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void traiterNoeudsParcoursLargeur(Consumer<V> traitementNoeud) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator<V> iterateurParcoursPrefixe() {
        return new ArbreIterateurPrefixe<>(this);
    }

}
