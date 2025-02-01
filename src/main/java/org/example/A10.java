package org.example;

public class A10 {
    public static void main(String[] args) {
        // Předpokládáme, že pole A obsahuje vstupní čísla
        int[] A = {3, 8, 12, 5, 6, 9, 10, 7};

        // Inicializace proměnných pro nejmenší číslo a jeho index
        int nejmenší = A[0];
        int indexNejmenšího = 0;

        // Projdeme všechna čísla v poli A
        for (int i = 1; i < A.length; i++) {
            // Kontrola nejmenšího čísla
            if (A[i] < nejmenší) {
                nejmenší = A[i];
                indexNejmenšího = i;
            }
        }

        // Výpis výsledku
        System.out.println("Nejmenší číslo: " + nejmenší + " (index: " + indexNejmenšího + ")");
    }
}