package it.nextre.academy.es4_4;

import it.nextre.academy.es3_3.Elenco;

import java.util.Random;

public class App44 {

    final static int PERSONE = 10;
    final static int OPERAZIONI = 5;
    final static double TASSO = 10;  // % di successo del task

    private Elenco[] db = new Elenco[PERSONE];


    public static void main(String[] args) {

        App44 app = new App44();
        app.caricaDati();
        //app.stampaMemoria();
        app.stampaStatistica();

    }//end main

    private void stampaStatistica() {
        double tot = 0;
        for(int i=0; i<this.db.length;i++){
            double tmp = (1.0*OPERAZIONI/this.db[i].getItems().length*100);
            tot+=tmp;
            System.out.println("Persona "+i+": "+tmp+"%");
        }
        System.out.println("In media tasso di successo del task è di: " + (tot/PERSONE)+"%" );
    }

    private void stampaMemoria() {
        for(Elenco tmp:db){
            for(int i=0;i<tmp.getItems().length;i++){
                System.out.print(tmp.getItem(i));
            }
            System.out.println("");
        }
    }

    private void caricaDati() {
        Random r = new Random();
        int successo = 0;
        for (int k=0; k<PERSONE;k++) {
            db[k] = new Elenco(1,true);
            successo = 0;
            while (successo < OPERAZIONI) {
                //tento il task
                int tentativo = r.nextInt(100);
                if (tentativo < TASSO) {
                    db[k].addItem("" + 1);
                    successo++;
                }else{
                    db[k].addItem("" + 0);
                }
            }
        }//end for
    }


}//end class
