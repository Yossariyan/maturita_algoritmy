package org.example;

public class A1 {
    public static void main(String[] args) {
        // Předpokládáme, že pole A obsahuje vstupní čísla
        int[] A = {3, 8, 12, 5, 6, 9, 10, 7};

        // Projdeme všechna čísla v poli A
        for (int cislo : A) {
            // Pokud je číslo sudé, vypíšeme ho
            if (cislo % 2 == 0) {
                System.out.println(cislo);
            }
        }
    }
}