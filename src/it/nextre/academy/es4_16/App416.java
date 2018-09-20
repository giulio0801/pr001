package it.nextre.academy.es4_16;

/*
* Simulare il calcolo della potenza di un numero data in ingresso base ed esponente. Eseguire il programma
con due metodi differenti, una funzione ricorsiva e un ciclo, non usare la classe Math o altre classi già
pronte.
* */


public class App416 {

    static Integer i ;      //il valore di default per tutti gli oggetti, anche x i wrapper, è null

    public static void main(String[] args) {

        //System.out.println(3+i);

        System.out.println(potenza(2,3));
        System.out.println(potenza(2,-3));
        System.out.println(potenza(-2,-3));
        System.out.println(potenza(-2,3));

    }//end main

    private static double potenza(double base, double esponente){
        if (base == 0 && esponente == 0)return 1;
        if (base == 0)return 0;
        if (esponente == 0) return 1;
        if (esponente>0){
            return base*potenza(base,esponente-1);
        }else{
            return 1.0/base*potenza(base,esponente+1);
        }
    }

}//end class
