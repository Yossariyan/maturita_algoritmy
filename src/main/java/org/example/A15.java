package org.example;

public class A15 {
    public static void main(String[] args) {
        int[] pole = {5, 2, 8, 1, 9}; // Zde můžete změnit hodnoty v poli

        int nejvetsi = pole[0]; // Předpokládáme, že první prvek je největší

        for (int i = 1; i < pole.length; i++) {
            if (pole[i] > nejvetsi) {
                nejvetsi = pole[i];
            }
        }

        System.out.println("Největší číslo je: " + nejvetsi);
    }
}