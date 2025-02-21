package org.example;

public class A29 {

    public static void main(String[] args) {
        // Předem zadaná matice (dvourozměrné pole)
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Výpočet a výpis součtů řádků
        for (int i = 0; i < A.length; i++) {
            int rowSum = 0; // Inicializace součtu pro aktuální řádek
            for (int j = 0; j < A[i].length; j++) {
                rowSum += A[i][j]; // Přidání prvku k součtu řádku
            }
            System.out.println("Součet prvků v řádku " + (i + 1) + ": " + rowSum);
        }
    }
}