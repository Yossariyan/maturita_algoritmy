package org.example;

public class A18 {

    public static void main(String[] args) {
        // Zadané hodnoty a, b, c
        int a = 10;
        int b = 5;
        int c = 15;

        // Hledání nejmenšího čísla
        int smallest = a; // Předpokládáme, že a je nejmenší

        if (b < smallest) {
            smallest = b; // Pokud je b menší, aktualizujeme
        }

        if (c < smallest) {
            smallest = c; // Pokud je c menší, aktualizujeme
        }

        // Výpis nejmenšího čísla
        System.out.println("Nejmenší číslo je: " + smallest);
    }
}