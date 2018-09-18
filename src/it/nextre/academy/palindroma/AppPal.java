package it.nextre.academy.palindroma;

public class AppPal {


    public static void main(String[] args) {


        // System.out.println((int)2.8); //tronco senza arrotondare, tengo solo l'intero e per questo non mi preoccupo se la parola ha una òlunghezza pari o dispari, al max il resto è un solo carattere che sarà sempre uguale a se stesso
        String test = "itopinonavevanonipoti";
        test="anana";
        test="anna";
        boolean palindroma = true;
        String s = test;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == (s.charAt(((s.length() - 1) - i)))) {}
            else {
                palindroma = false;
                break;
            }
        }//end for
        if (palindroma){
            System.out.println("PALINDROMA");
        }else{
            System.out.println("NON PALINDROMA");
        }


        // non ottimale perchè raddoppio i cicli, prima per invertire e poi x controllare

        /*
        String reverse = "";
        int length = test.length();
        for(int i = length-1 ;i>=0;i--){
            reverse+=test.charAt(i);
        }
        if (test.equals(reverse)){
            System.out.println("PALINDROMA");
        }else{
            System.out.println("NON PALINDROMA");
        }
        */

    }//end main

}//end class
