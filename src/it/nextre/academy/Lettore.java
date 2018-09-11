package it.nextre.academy;

import java.util.Scanner;

public class Lettore {

    public static void main(String[] args) {


        System.out.println("Scrivi il tuo nome");
        String nome = leggiTesto();
        System.out.println(nome);

        System.out.println("Scrivi il tuo nome2");
        String nome2 = leggiTesto();
        System.out.println(nome2);
    }//end main


    private static String leggiTesto(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

}//end class
