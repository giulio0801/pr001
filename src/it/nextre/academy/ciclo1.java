package it.nextre.academy;

import java.util.Arrays;
import java.util.Scanner;

public class ciclo1 {

    public static void main(String[] args) {
        //alfabeto();
        //stampaNomePugliese();


        System.out.println("Inserisci il numero di colonne");
        alfabetoColonne(leggiIntero());










        Utente u1 = new Utente("Mario",30);
        Utente u2 = new Utente("Chiara",33);
        Utente u3 = new Utente("Mario",30);

        Utente[] ua = {u1,u2};
        Utente[] ua2 = {u3,u2};
/*
        boolean uguali=true;
        for(int i=0;i<ua.length;i++){
            if(!(ua[i].equals(ua2[i]))){
                uguali=false;
                break;
            }
        }
        */
        if(Arrays.equals(ua,ua2))
            System.out.println("array uguali");
        else
            System.out.println("array diversi");






    }//end main

    private static void stampaNomePugliese() {
        System.out.println("Come ti chiami?");
        String nome = leggiTesto();
        System.out.println("Il tuo nome sarà: "+rimuoviVocali(nome));
        System.out.println("Il tuo nome sarà: "+rimuoviVocaliBruttoMaUnPoMeglio(nome));
        System.out.println("nome senza L: " + rimuoviIgnoreCase("L",nome));
    }

            // VALERIO

    private static String rimuoviVocaliBrutto(String parola) {
        String out="";
        for(int i=0;i<parola.length();i++){
            char tmp = parola.charAt(i);
            if (tmp=='A' || tmp=='E' || tmp=='I' || tmp=='O' || tmp=='U'
                    || tmp=='a' || tmp=='e' || tmp=='i' || tmp=='o' || tmp=='u'){

            }else{
                out+=tmp;
            }
            //System.out.println(out);

        }
        return out;
    }

    private static String rimuoviVocaliBruttoMaUnPoMeglio(String parola) {
        String out="";
        for(int i=0;i<parola.length();i++){
            String tmp = ""+parola.charAt(i);
            if (    tmp.equalsIgnoreCase("a") ||
                    tmp.equalsIgnoreCase("e") ||
                    tmp.equalsIgnoreCase("i") ||
                    tmp.equalsIgnoreCase("o") ||
                    tmp.equalsIgnoreCase("u")
                    ){
            }else{
                out+=tmp;
            }
            //System.out.println(out);

        }
        return out;
    }



    private static String rimuoviVocali(String parola) {
        return parola.replaceAll("[a,e,i,o,u,A,E,I,O,U]","");
    }

    private static String rimuoviIgnoreCase(String carattere, String parola){
        String out="";
        for (char x : parola.toCharArray()){
            if (!carattere.equalsIgnoreCase(""+x)){
                out+=x;
            }
        }
        return out;
    }

    private static String rimuovi(String carattere, String parola){
        String out="";
        for (char tmp : parola.toCharArray()){
            if (!carattere.equals(""+tmp)){
                out+=tmp;
            }
        }
        return out;
    }





    private static String leggiTesto(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    private static int leggiIntero(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static char valida(char x){
        return x>='a'&&x<='z' ? x : '\u0000';
    }

    private static void alfabetoColonne(int colonne){
        //System.out.println("colonne lette: " + colonne);
        for(int k=96;k<123;){
            for(int c=0; c<colonne;c++) {
                System.out.print("\t" + valida((char) (++k)));
            }
            System.out.println("");
        }

    }


    private static void alfabeto(){
        for(int k=96;k<123;){
            System.out.println(
                    "\t"+valida((char)(++k))
                            + "\t"+valida((char)(++k))
                            + "\t"+valida((char)(++k))
                            + "\t"+valida((char)(++k))
            );
        }
    }

}//end class
