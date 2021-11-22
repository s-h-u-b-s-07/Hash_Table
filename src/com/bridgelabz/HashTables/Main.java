package com.bridgelabz.HashTables;

public class Main {

    public static void main(String[] args) {
        System.out.println("HASH TABLE IMPLEMENTATION");

        HashTable hashTable = new HashTable(10);
        hashTable.put(10, "To");
        hashTable.put(20, "be");
        hashTable.put(30, "or");
        hashTable.put(40, "not");
        hashTable.put(50, "to");
        hashTable.put(60, "be");

        System.out.println(hashTable.freqChecker("be"));

    }
}
