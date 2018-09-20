package it.nextre.academy.es5_4;

public class App54 {

    public static final int GIOCATORI = 10;
    public static double BET = 10.0;  //costo giocata
    public static final int NUMERI_SCHEDINA = 15;  //numeri scelti su ogni schedina
    public static final int NUMERI_TABELLONE = 90;  //numeri estraibili

    public static final double vitt4 = 1.1;  //numeri estraibili
    public static final double vitt5 = 1.2;  //numeri estraibili
    public static final double vitt6 = 1.4;  //numeri estraibili



    public static void main(String[] args) {

        if (NUMERI_SCHEDINA>=NUMERI_TABELLONE || NUMERI_SCHEDINA<6){
            System.err.println("Parametri non validi");
            System.exit(-1);
        }


        //creo i giocatori
        Giocatore[] giocatori = new Giocatore[GIOCATORI];
        //inizializzo i giocatori
        double budget=100;
        for (int i = 0; i < GIOCATORI ; i++) {
            //budget = randomaBuget
            giocatori[i]=new Giocatore("Giocatore "+(i+1), budget);
        }//end for


        int giocatoriManche = GIOCATORI;

        //per ogni giocata devo:
        estrazioni: while(true){

            if(giocatoriManche<3){
                BET*=2;
            }

            //resetto i valori per ogni manche
            giocatoriManche = 0; //resetto il numero di giocatori per questa manche
            GeneraSchedina.getInstance().cancellaSchedine(); //cancello le schedine delle manche precedenti
            Tabellone.getInstance().cancellaTabellone(); //preparo il tabellone per la nuova giocata

            //per ogni giocatore controllare se può giocare (budget) e assegnare una nuova schedina scalando il bet
            for (int i = 0; i < GIOCATORI ; i++) {
                if(giocatori[i].puoGiocare(BET)){
                    giocatori[i].compraSchedina(BET, GeneraSchedina.getInstance().nuovaSchedina());
                    giocatori[i].conteggiaGiocate();
                    giocatoriManche++;
                }
            }//end for


            if(giocatoriManche<=1){
                //interrompo altrimenti il singolo vincerà sempre lui
                break estrazioni;
            }

            System.out.println("Giocano "+giocatoriManche+" giocatori");
            if(giocatoriManche<3) {
                getInfoGiocatori(giocatori);
            }


            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            //per ogni estrazione controllare se qualche giocatore ha fatto 6, nel caso interrompo le estrazioni
            boolean vittoria=false;
            while(!vittoria && Tabellone.getInstance().getEstrazioni()<NUMERI_TABELLONE){
                Tabellone.getInstance().estrai();
                //controllo sestina per interrompere le estrazioni
                for(Giocatore gtmp : giocatori) {
                    if(!gtmp.isInPartita())continue;
                    if(Giudice.controlla(Tabellone.getInstance(),gtmp)>=6){
                        vittoria=true;
                        //System.out.println(Tabellone.getInstance());
                        //System.out.println("il giocatore "+gtmp.getNome()+" ha fatto 6!");
                        break;
                    }
                }
            }

            //ora controllo ogni schedina per ogni giocatore
            //a fine estrazione per ogni giocatore controllo se ha fatto quartina cinquina o sestina
            //in base al risultato distribuisco il premio (non diviso tra i vincenti)
            for(Giocatore gtmp : giocatori) {
                if(!gtmp.isInPartita())continue;
                int punteggio=Giudice.controlla(Tabellone.getInstance(), gtmp);
                //System.out.println("Giocatore "+gtmp.getNome()+" punteggio: "+punteggio);
                switch(punteggio){
                    case 4:
                        gtmp.addVincita(BET*vitt4);
                        gtmp.conteggia4();
                        break;
                    case 5:
                        gtmp.addVincita(BET*vitt5);
                        gtmp.conteggia5();
                        break;
                    case 6:
                        gtmp.addVincita(BET*vitt6);
                        gtmp.conteggia6();
                        break;
                    default:break ;
                }
            }
            //riparto con una nuova estrazioni


            //getInfo(giocatori);

            //System.exit(34);
        }

        getInfo(giocatori);



    }//end main




    public static void getInfo(Giocatore[] giocatori) {
        for (Giocatore gtmp : giocatori) {
            System.out.println("GIOCATORE: " + gtmp.getNome());
            System.out.println("\tQuartine : " + gtmp.getConteggia4());
            System.out.println("\tCinquine : " + gtmp.getConteggia5());
            System.out.println("\tSestine  : " + gtmp.getConteggia6());
            System.out.println("\tPartite  : " + gtmp.getGiocate());
            System.out.println("\tSALDO    : " + gtmp.getBudget());
            System.out.println("\n");
        }
    }

    public static void getInfoGiocatori(Giocatore[] giocatori) {
        System.out.println("#######################################################");
        System.out.println("#######################################################");
        System.out.println("#######################################################");
        System.out.println("#######################################################");
        System.out.println("#######################################################");
        for (Giocatore gtmp : giocatori) {
            if(!gtmp.isInPartita())continue;
            System.out.println("GIOCATORE: " + gtmp.getNome());
            System.out.println("\tQuartine : " + gtmp.getConteggia4());
            System.out.println("\tCinquine : " + gtmp.getConteggia5());
            System.out.println("\tSestine  : " + gtmp.getConteggia6());
            System.out.println("\tPartite  : " + gtmp.getGiocate());
            System.out.println("\tSALDO    : " + gtmp.getBudget());
            System.out.println("\n");
        }
    }



}//end class
