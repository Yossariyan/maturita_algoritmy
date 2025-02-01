package org.example;

import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        // Inicializace Scanneru pro vstup od uživatele
        Scanner scanner = new Scanner(System.in);

        // Načtení čísla n od uživatele
        System.out.print("Zadejte číslo n: ");
        int n = scanner.nextInt();

        // Výpočet Fibonacciho čísla
        int výsledek = fibonacci(n);

        // Výpis výsledku
        System.out.println("F(" + n + ") = " + výsledek);

        // Zavření Scanneru
        scanner.close();
    }

    /**
     * Metoda pro výpočet Fibonacciho čísla F(n).
     *
     * @param n Index Fibonacciho čísla.
     * @return Hodnota F(n).
     */
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0; // F(0) = 0
        } else if (n == 1) {
            return 0; // F(1) = 0
        }

        // Inicializace prvních dvou Fibonacciho čísel
        int a = 0;
        int b = 1;

        // Výpočet F(n) pomocí iterace
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return a;
    }
}