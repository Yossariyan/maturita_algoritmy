package org.example;

import java.util.Scanner;

public class A19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE; // Inicializace na maximální možnou hodnotu

        System.out.println("Zadávejte čísla (pro ukončení zadejte 0):");

        while (true) {
            int number = scanner.nextInt(); // Načtení čísla

            if (number == 0) {
                break; // Ukončení zadávání
            }

            if (number < smallest) {
                smallest = number; // Aktualizace nejmenšího čísla
            }
        }

        // Výpis nejmenšího čísla
        if (smallest != Integer.MAX_VALUE) {
            System.out.println("Nejmenší zadané číslo je: " + smallest);
        } else {
            System.out.println("Nebylo zadáno žádné číslo.");
        }

        scanner.close();
    }
}