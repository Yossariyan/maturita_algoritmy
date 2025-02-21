package org.example;

import java.util.Scanner;

public class A21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE; // Inicializace na nejmenší možnou hodnotu

        System.out.println("Zadávejte čísla (pro ukončení zadejte 0):");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break; // Ukončení zadávání
            }

            if (number > max) {
                max = number; // Aktualizace největšího čísla
            }
        }

        if (max != Integer.MIN_VALUE) {
            System.out.println("Největší zadané číslo je: " + max);
        } else {
            System.out.println("Nebylo zadáno žádné číslo.");
        }

        scanner.close();
    }
}