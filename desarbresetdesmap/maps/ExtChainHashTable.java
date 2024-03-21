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
package desarbresetdesmap.maps;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Remi Venant
 * @param <K> type of key
 * @param <V> type of value
 */
public class ExtChainHashTable<K, V> implements HashTable<K, V> {
	protected static final int DEFAULT_ARRAY_SIZE = 100;

	private final LinkedList<HashTableEntryBaseImpl<K, V>>[] entries;
	private int nbEntries;

	/**
	 * Build an external chaining hash table with a specific array size.
	 * 
	 * @param arraySize the array size
	 */
	public ExtChainHashTable(int arraySize) {
		this.entries = new LinkedList[arraySize];
		this.nbEntries = 0;

	}

	private int getIndexFromKey(K key) {
		if (key == null) {
			throw new NullPointerException("The key can't be null");
		}
		return key.hashCode() % this.entries.length;

	}

	/**
	 * Build an external chaining hash table with the default array size.
	 * 
	 */
	public ExtChainHashTable() {
		this(DEFAULT_ARRAY_SIZE);
	}

	@Override
	public void put(K key, V value) {
		final int idx = this.getIndexFromKey(key);

		if (this.entries[idx] == null) {
			this.entries[idx] = new LinkedList<>();
		}
		for (HashTableEntryBaseImpl<K, V> entry : this.entries[idx]) {
			if (entry.getKey().equals(key)) {
				entry.setValue(value);
				return;
			}
		}
		this.entries[idx].add(new HashTableEntryBaseImpl<>(key, value));
		this.nbEntries++;
	}

	@Override
	public V remove(K key) {
		final int idx = this.getIndexFromKey(key);

		if (this.entries[idx] == null) {
			return null;
		}

		final Iterator<HashTableEntryBaseImpl<K, V>> itListCol = this.entries[idx].iterator();
		while (itListCol.hasNext()) {
			final HashTableEntryBaseImpl<K, V> entry = itListCol.next();
			if (entry.getKey().equals(key)) {
				itListCol.remove();
				this.nbEntries--;
				return entry.getValue();
			}
		}
		return null;
	}

	@Override
	public V get(K key) {
		final int idx = this.getIndexFromKey(key);

		if (this.entries[idx] == null) {
			return null;
		}

		final Iterator<HashTableEntryBaseImpl<K, V>> itListCol = this.entries[idx].iterator();
		while (itListCol.hasNext()) {
			final HashTableEntryBaseImpl<K, V> entry = itListCol.next();
			if (entry.getKey().equals(key)) {
				return entry.getValue();
			}
		}
		return null;
	}

	@Override
	public boolean contains(K key) {
		final int idx = this.getIndexFromKey(key);

		if (this.entries[idx] == null) {
			return false;
		}

		final Iterator<HashTableEntryBaseImpl<K, V>> itListCol = this.entries[idx].iterator();
		while (itListCol.hasNext()) {
			final HashTableEntryBaseImpl<K, V> entry = itListCol.next();
			if (entry.getKey().equals(key)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int size() {
		return this.nbEntries;
	}

	@Override
	public Iterator<HashTableEntry<K, V>> iterator() {
		return new ExtChainHashTableIterator();
	}

	/**
	 * Implementation of the iterator for the External chaining hash table class
	 */
	private class ExtChainHashTableIterator implements Iterator<HashTableEntry<K, V>> {

		@Override
		public boolean hasNext() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public HashTableEntry<K, V> next() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

	}
}
