package org.example;

public class A11 {

    public static void main(String[] args) {
        // Zadané koeficienty kvadratické rovnice
        double a = 1.0;
        double b = -3.0;
        double c = 2.0;

        // Výpočet diskriminantu
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            // Dva reálné kořeny
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Dva reálné kořeny: " + root1 + " a " + root2);
        } else if (discriminant == 0) {
            // Jeden reálný kořen (dvojnásobný)
            double root = -b / (2 * a);
            System.out.println("Jeden reálný kořen (dvojnásobný): " + root);
        } else {
            // Komplexní kořeny
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Komplexní kořeny: " + realPart + " + " + imaginaryPart + "i a " + realPart + " - " + imaginaryPart + "i");
        }
    }
}