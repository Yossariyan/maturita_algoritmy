package org.example;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        // Inicializace Scanneru pro vstup od uživatele
        Scanner scanner = new Scanner(System.in);

        // Proměnné pro součet hmotností a počet žáků
        double součet = 0;
        int početŽáků = 0;

        // Nekonečný cyklus pro načítání hmotností
        while (true) {
            System.out.print("Zadejte hmotnost žáka (0 pro ukončení): ");
            double hmotnost = scanner.nextDouble();

            // Ukončení cyklu, pokud je zadána nulová hmotnost
            if (hmotnost == 0) {
                break;
            }

            // Přidání hmotnosti k součtu a zvýšení počtu žáků
            součet += hmotnost;
            početŽáků++;
        }

        // Výpočet průměrné váhy
        if (početŽáků > 0) {
            double průměr = součet / početŽáků;
            System.out.println("Průměrná váha žáka je: " + průměr);
        } else {
            System.out.println("Nebyly zadány žádné hmotnosti.");
        }

        // Zavření Scanneru
        scanner.close();
    }
}