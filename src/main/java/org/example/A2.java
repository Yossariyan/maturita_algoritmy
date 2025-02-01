package org.example;

import java.util.Arrays;

public class A2 {
    public static void main(String[] args) {
        int[] cisla = {4, 9, 7};
        //Sortnu cisla od nejmensiho po nejvetsi
        int[] cislaSorted = Arrays.stream(cisla).sorted().toArray();
        System.out.println("Strany trojuhelniku: " + Arrays.toString(cislaSorted));

        //Zkontroluju jestli 2 nejmenší strany jsou větší jak největší strana
        if (cislaSorted[0] + cislaSorted[1] > cislaSorted[2]) {
            System.out.println("Lze sestrojit trojuhelnik");
        }
        else{
            System.out.println("Nelze sestrojit trojuhelnik");
        }


    }
}
