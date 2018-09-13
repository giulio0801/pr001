package it.nextre.academy.ricorsione;

import java.util.Scanner;

public class MyUtils {

    public static int leggiIntero(){
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine();
        if (isNumero(tmp))
            return Integer.parseInt(tmp);
        else{
            System.out.println("Formato non valido, riprova");
            return leggiIntero();
        }
    }

    public static int leggiInteroPositivo(){
        int x = leggiIntero();
        if(x<0){
            System.out.println("inserire un valore positivo >=0");
            return leggiInteroPositivo();
        }
        return x;
    }


    public static boolean isNumero(String item) {
        boolean isNumero=true;
        for(int i=0;i<item.length();i++){
            String x = ""+item.charAt(i);
            if(i==0 && (x.equalsIgnoreCase("+") || x.equals("-")))continue;
            if(x.charAt(0)>=48 && x.charAt(0)<=57){}
            else{
                isNumero=false;
                break;
            }
        }
        return isNumero;
    }

    public static void main(String[] args) {
        System.out.println("Quante partite vuoi fare?");
        int partite = leggiInteroPositivo();
        System.out.println(partite);
    }//end main

}//end class
