package org.example;

public class A25 {

    public static void main(String[] args) {
        // Předem zadané hodnoty
        int n = 450001;
        int m = 5;

        // Kontrola, zda m není nula (dělení nulou není definováno)
        if (m == 0) {
            System.out.println("Chyba: Nelze dělit nulou.");
        } else {
            // Výpočet celočíselného podílu a zbytku
            int quotient = n / m; // Celočíselný podíl
            int remainder = n % m; // Zbytek po dělení

            // Výstup výsledků
            System.out.println("Celočíselný podíl: " + quotient);
            System.out.println("Zbytek po dělení: " + remainder);
        }
    }
}