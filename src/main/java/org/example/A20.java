package org.example;

public class A20 {
    public static void main(String[] args) {
        //Zadane cislo
        String cislo = "64645112";
        //Řády čísla
        int cifry = 1;
        //Delka cisla, abych zjistil, jakej je nejvyssi rad
        int delkaCisla = cislo.length();
        //Cyklus, vypise kazdou cifru a jeji rad
        for (int i = delkaCisla-1; i>=0; i-- ){
            System.out.println(cislo.charAt(i) + "*" + cifry);
            //Posuneme rad vzdycky o 10
            cifry = cifry * 10;
        }
    }


}
