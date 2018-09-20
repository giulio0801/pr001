package it.nextre.academy.es5_4;

/*
* classe singleton per la generazione dei numeri sul tabellone per ogni manche
* */

import java.util.Arrays;
import java.util.Random;

public class Tabellone {

    private int[] memoria;
    private int estratti=0;
    private static Tabellone instance;
    private static Random r = new Random();


    private Tabellone(){
        this.memoria = new int[App54.NUMERI_TABELLONE];
    }

    public static Tabellone getInstance(){
        if (instance == null){
            instance = new Tabellone();
        }
        return instance;
    }

    public void cancellaTabellone(){
        //resetto la memoria del tabellone
        //instance = new Tabellone(); //non ottimale perchè resetta anche le altre variabili di istanza
        this.memoria = new int[App54.NUMERI_TABELLONE];
        this.estratti=0;
    }

    public int estrai() {
        int tmp = 1 + r.nextInt(App54.NUMERI_TABELLONE);
        boolean presente=false;
        for (int i = 0; i < estratti; i++) {
            if(memoria[i]>0 && memoria[i]==tmp){
                presente=true;
                break;
            }
        }//end for
        if(presente){
            return estrai();
        }else{
            memoria[estratti]=tmp;
            estratti++;
            return tmp;
        }
    }

    public int getEstrazioni(){
        return estratti;
    }

    @Override
    public String toString() {
        return "TABELLONE: " + Arrays.toString(this.getNumeriEstratti());
    }

    public int[] getNumeriEstratti() {
        int[] tmp = new int[memoria.length];
        for (int i = 0; i < memoria.length; i++) {
            tmp[i]=memoria[i];
        }//end for
        Arrays.sort(tmp);
        return tmp;
    }
}//end class
