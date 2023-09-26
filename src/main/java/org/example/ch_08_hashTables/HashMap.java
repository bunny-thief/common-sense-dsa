package org.example.ch_08_hashTables;

public class HashMap {

    private String[] hashMap;

    public HashMap() {
        hashMap = new String[150];
    }

    public HashMap(int initialCapacity) {
        hashMap = new String[initialCapacity];
    }

    public int hash(String key) {
        int hash = 1;

        for (int i = 0; i < key.length(); i++) {
            hash *= key.charAt(i) - '`';
        }

        return hash;
    }

    public void put(String key, String value) {
        hashMap[hash(key)] = value;
    }

    public String get(String key) {
        return hashMap[hash(key)];
    }

}
