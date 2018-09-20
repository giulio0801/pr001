package it.nextre.academy.es5_4;


import java.util.Arrays;
import java.util.Random;

public class Schedina {

    private static Random r = new Random();
    private int[] numeri;

    public Schedina(int capienza) {
        if (capienza>=1 && capienza <=App54.NUMERI_TABELLONE) {
            this.numeri = new int[capienza];
            riempi();
            Arrays.sort(this.numeri);
            //System.out.println(toString()); //stampa temporanea
        }else{
            throw new IllegalArgumentException("La capienza della schedina deve essere compresa tra 1 e "+App54.NUMERI_TABELLONE);
        }
    }

    private void riempi() {
        generaNumCasuale: for (int i = 0; i < this.numeri.length ; ) {
            int tmp = 1 + r.nextInt(App54.NUMERI_TABELLONE);
            for (int j = 0; j < i; j++) {
                if(this.numeri[j]==tmp){
                    //se già esiste, riparto col ciclo esterno ma non incremento il contatore
                    continue generaNumCasuale;
                }
            }//end for
            this.numeri[i]=tmp;
            i++;
        }//end for
    }

    public int[] getNumeriSchedina(){
        return this.numeri;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.numeri);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedina schedina = (Schedina) o;
        return Arrays.equals(numeri, schedina.numeri); //lavora se ben ordinati
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(numeri);
    }
}//end class














