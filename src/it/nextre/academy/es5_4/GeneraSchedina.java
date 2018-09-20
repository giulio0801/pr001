package it.nextre.academy.es5_4;

/*
* classe singleton per la generazione di schedine UNIVOCHE per ogno manche
* */

public class GeneraSchedina {

    private Schedina[] memoria;
    private static GeneraSchedina instance;

    private GeneraSchedina(){
        this.memoria = new Schedina[App54.GIOCATORI];
    }

    public static GeneraSchedina getInstance(){
        if (instance == null){
            instance = new GeneraSchedina();
        }
        return instance;
    }

    public void cancellaSchedine(){
        //resetto la memoria
        //instance = new GeneraSchedina(); //non ottimale perchè resetta anche le altre variabili di istanza
        this.memoria = new Schedina[App54.GIOCATORI];
    }

    public Schedina nuovaSchedina() {
        Schedina schedina = new Schedina(App54.NUMERI_SCHEDINA);
        boolean presente=false;

        for (int i = 0; i < memoria.length; i++) {
            if(memoria[i]!=null && memoria[i].equals(schedina)){
                presente=true;
                break;
            }
        }//end for

        if(presente){
            return nuovaSchedina();
        }else{
            return schedina;
        }
    }
}//end class
