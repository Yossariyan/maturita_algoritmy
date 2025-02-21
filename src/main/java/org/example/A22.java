package org.example;

public class A22 {

    public static void main(String[] args) {
        // Předem zadané pole čísel
        int[] A = {3, 7, 4, 9, 2, 6, 8, 5, 1, 10};

        int lastEvenNumber = -1; // Inicializace pro uložení posledního sudého čísla
        int lastEvenIndex = -1;  // Inicializace pro uložení indexu posledního sudého čísla

        // Procházení pole od začátku do konce
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) { // Kontrola, zda je číslo sudé
                lastEvenNumber = A[i];
                lastEvenIndex = i;
            }
        }

        // Výstup výsledku
        if (lastEvenIndex != -1) {
            System.out.println("Poslední sudé číslo je " + lastEvenNumber + " a jeho index je " + lastEvenIndex + ".");
        } else {
            System.out.println("V poli není žádné sudé číslo.");
        }
    }
}