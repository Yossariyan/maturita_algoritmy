package org.example;

public class A17 {

    public static void main(String[] args) {
        // Zadané číslo n
        int n = 123; // Můžete změnit hodnotu

        // Určení délky čísla
        if (n >= -9 && n <= 9) {
            System.out.println("Číslo " + n + " je jednociferné.");
        } else if ((n >= 10 && n <= 99) || (n <= -10 && n >= -99)) {
            System.out.println("Číslo " + n + " je dvouciferné.");
        } else {
            System.out.println("Číslo " + n + " je víceciferné.");
        }
    }
}