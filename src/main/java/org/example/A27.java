package org.example;

public class A27 {

    public static void main(String[] args) {
        // Předem zadané pole čísel
        int[] A = {5, 3, 8, 1, 9, 2};

        // Výpočet průměru
        double sum = 0;
        for (int num : A) {
            sum += num;
        }
        double average = sum / A.length;

        // Nalezení minimálního prvku a jeho indexu
        int minIndex = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[minIndex]) {
                minIndex = i;
            }
        }

        // Nahrazení minimálního prvku průměrem
        A[minIndex] = (int) average; // Přetypování průměru na int (pokud je potřeba)

        // Výpis pole po změně
        System.out.print("Pole po změně: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println("\nPrůměr: " + average);
    }
}