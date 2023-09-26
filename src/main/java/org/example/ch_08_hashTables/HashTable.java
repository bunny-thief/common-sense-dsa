package org.example.ch_08_hashTables;

public class HashTable {

    private String[] hashTable;

    public HashTable() {
        hashTable = new String[150];
    }

    public HashTable(int initialCapacity) {
        hashTable = new String[initialCapacity];
    }

    public int hash(String key) {
        int hash = 1;

        for (int i = 0; i < key.length(); i++) {
            hash *= key.charAt(i) - '`';
        }

        return hash;
    }

    public void put(String key, String value) {
        hashTable[hash(key)] = value;
    }

    public String get(String key) {
        return hashTable[hash(key)];
    }

}
