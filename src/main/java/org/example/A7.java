package org.example;

public class A7 {
    public static void main(String[] args) {
        // Předpokládáme, že pole A obsahuje vstupní čísla
        int[] A = {3, 8, 12, 5, 6, 9, 10, 7};

        // Projdeme všechna čísla v poli A
        for (int i = 0; i < A.length; i++) {
            // Pokud je index lichý, vypíšeme číslo
            if (i % 2 == 0) {
                System.out.println(A[i]);
            }
        }
    }
}