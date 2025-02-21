package org.example;

import java.util.Scanner;

public class A24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Načtení čísla od uživatele
        System.out.print("Zadejte celé číslo: ");
        int n = scanner.nextInt();

        // Kontrola, zda je číslo prvočíslo
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false; // Čísla menší nebo rovna 1 nejsou prvočísla
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false; // Pokud je dělitelné, není to prvočíslo
                    break;
                }
            }
        }

        // Výstup výsledku
        if (isPrime) {
            System.out.println(n + " je prvočíslo.");
        } else {
            System.out.println(n + " není prvočíslo.");
        }

        scanner.close();
    }
}