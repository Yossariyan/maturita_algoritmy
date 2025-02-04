package org.example;

public class A13 {
    public static void main(String[] args) {
        // Zadané hodnoty v poli
        int[] pole = {5, 2, 8, 1, 9};

        // Inicializace proměnné pro nejmenší číslo
        int nejmensi = pole[0];

        // Procházení celého pole a hledání nejmenšího čísla
        for (int i = 1; i < pole.length; i++) {
            if (pole[i] < nejmensi) {
                nejmensi = pole[i];
            }
        }

        System.out.println("Nejmenší číslo je: " + nejmensi);
    }
}