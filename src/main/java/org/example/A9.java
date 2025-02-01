package org.example;

public class A9 {
    public static void main(String[] args) {
        // Předpokládáme, že pole A obsahuje vstupní čísla
        int[] A = {3, 8, 12, 5, 6, 9, 10, 7};

        // Inicializace proměnných pro nejmenší a největší číslo
        int nejmenší = A[0];
        int největší = A[0];

        // Projdeme všechna čísla v poli A
        for (int i = 1; i < A.length; i++) {
            // Kontrola nejmenšího čísla
            if (A[i] < nejmenší) {
                nejmenší = A[i];
            }
            // Kontrola největšího čísla
            if (A[i] > největší) {
                největší = A[i];
            }
        }

        // Výpis výsledků
        System.out.println("Nejmenší číslo: " + nejmenší);
        System.out.println("Největší číslo: " + největší);
    }
}