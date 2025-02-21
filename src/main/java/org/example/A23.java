package org.example;

public class A23 {

    public static void main(String[] args) {
        // Předem zadané pole čísel
        int[] A = {3, 7, 4, 9, 2, 6, 8, 5, 1, 10};

        int lastOddNumber = -1; // Inicializace pro uložení posledního lichého čísla
        int lastOddIndex = -1;  // Inicializace pro uložení indexu posledního lichého čísla

        // Procházení pole od začátku do konce
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) { // Kontrola, zda je číslo liché
                lastOddNumber = A[i];
                lastOddIndex = i;
            }
        }

        // Výstup výsledku
        if (lastOddIndex != -1) {
            System.out.println("Poslední liché číslo je " + lastOddNumber + " a jeho index je " + lastOddIndex + ".");
        } else {
            System.out.println("V poli není žádné liché číslo.");
        }
    }
}