package org.example;

public class A12 {

    public static void main(String[] args) {
        // Zadané pole čísel
        int[] A = {3, 7, 2, 9, 5, 1, 8};

        // Inicializace proměnných pro největší číslo a jeho index
        int maxNumber = A[0];
        int maxIndex = 0;

        // Procházení pole a hledání největšího čísla
        for (int i = 1; i < A.length; i++) {
            if (A[i] > maxNumber) {
                maxNumber = A[i];
                maxIndex = i;
            }
        }

        // Výpis výsledku
        System.out.println("Největší číslo je " + maxNumber + " a nachází se na indexu " + maxIndex);
    }
}