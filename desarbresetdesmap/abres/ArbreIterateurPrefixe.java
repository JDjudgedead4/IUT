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

import java.util.Iterator;

/**
 *
 * @author Remi Venant
 * @param <V> type de valeurs de l'arbe
 */
public class ArbreIterateurPrefixe<V> implements Iterator<V> {
    
    private final Arbre<V> arbre; //L'arbre à itérer
    
    public ArbreIterateurPrefixe(Arbre<V> arbre) {
        this.arbre = arbre;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public V next() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
