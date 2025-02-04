package org.example;

public class A16 {

    public static void main(String[] args) {
        // Zadané hodnoty a, b, c
        int a = 10;
        int b = 25;
        int c = 15;

        // Hledání největšího čísla
        int largest = a; // Předpokládáme, že a je největší

        if (b > largest) {
            largest = b; // Pokud je b větší, aktualizujeme
        }

        if (c > largest) {
            largest = c; // Pokud je c větší, aktualizujeme
        }

        // Výpis největšího čísla
        System.out.println("Největší číslo je: " + largest);
    }
}