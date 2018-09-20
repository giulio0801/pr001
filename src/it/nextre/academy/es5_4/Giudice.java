package it.nextre.academy.es5_4;

public class Giudice {

    public static int controlla(Tabellone tabellone, Giocatore giocatore){
        int[] arrT = tabellone.getNumeriEstratti();
        int[] arrS = giocatore.getSchedina().getNumeriSchedina();
        int presenti=0;

        for (int i = 0; i < arrT.length; i++) {
            for (int j = 0; j < arrS.length; j++) {
                if(arrT[i] == arrS [j]){
                    presenti++;
                }
            }
        }
        return  presenti;
    }

}//end class
