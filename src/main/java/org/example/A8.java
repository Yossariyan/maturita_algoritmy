package org.example;

public class A8 {
    public static void main(String[] args) {
        // Předpokládáme, že pole A obsahuje vstupní čísla
        int[] A = {5, 8, 12, 5, 6, 9, 1, 7};

        // Inicializace proměnných pro nejmenší a největší číslo
        int nejmenší = A[0];
        int největší = A[0];
        int indexNejmenšího = 0;
        int indexNejvětšího = 0;

        // Projdeme všechna čísla v poli A
        for (int i = 1; i < A.length; i++) {
            // Kontrola nejmenšího čísla
            if (A[i] < nejmenší) {
                nejmenší = A[i];
                indexNejmenšího = i;
            }
            // Kontrola největšího čísla
            if (A[i] > největší) {
                největší = A[i];
                indexNejvětšího = i;
            }
        }

        // Výpis výsledků
        System.out.println("Nejmenší číslo: " + nejmenší + " (index: " + indexNejmenšího + ")");
        System.out.println("Největší číslo: " + největší + " (index: " + indexNejvětšího + ")");
    }
}