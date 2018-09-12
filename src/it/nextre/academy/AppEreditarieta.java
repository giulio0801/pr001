package it.nextre.academy;

import it.nextre.academy.ereditarieta.Azienda;
import it.nextre.academy.ereditarieta.Contratto;
import it.nextre.academy.ereditarieta.Dipendente;


public class AppEreditarieta {

    Dipendente[] registro;

    public static void main(String[] args) {

        AppEreditarieta app = new AppEreditarieta();
        app.init();
        //Per ogni dipendente stampare
        // NOME COGNOME, tipocontratto, compenso
        for(Dipendente tmp : app.registro){
            //System.out.println(ssss);
            System.out.println(tmp.getNome().toUpperCase() + " " + tmp.getCognome().toUpperCase() + ", " +
        (tmp.getContratto()!=null ? tmp.getContratto().getNome() : "Nessuno")
        +", "+tmp.getCompensoConcordato()+"€");
        }


    }//end main


    public void init(){
        Azienda nextre = new Azienda("Nextre Engineering S.R.L.");
        nextre.setPartitaIva("04787620964");
        nextre.setDipendenti(80);
        nextre.setIndirizzoSedeLegale("Via Imperia, 2 - 20142 Milano (MI)");
        //System.out.println(nextre);

        //creo il personale
        Dipendente capo = new Dipendente();
        Dipendente contabile = new Dipendente();
        Dipendente commerciale = new Dipendente();
        Dipendente dev1 = new Dipendente();
        Dipendente dev2 = new Dipendente();

        capo.setNome("Mirko");
        capo.setCognome("Cuneo");
        capo.setRuolo("Grande Boss");
        capo.setAzienda(nextre);
        capo.setCf("MRKCNO76P08V855M");


        contabile.setNome("Silvano");
        contabile.setCognome("Rogi");
        contabile.setRuolo("Stacca Stipendi");
        contabile.setAzienda(nextre);
        contabile.setContratto(new Contratto("55Z8", "Finanza e Servizi",80,false));
        contabile.setCompensoConcordato(850.24);

        commerciale.setNome("Paolo");
        commerciale.setCognome("Bitta");
        commerciale.setRuolo("Vendi Fuffa");
        commerciale.setAzienda(nextre);
        commerciale.setContratto(new Contratto("100A","Fuffolo",80, false));
        commerciale.setCompensoConcordato(1480.00);

        dev1.setNome("Fabio");
        dev1.setCognome("Biondi");
        dev1.setRuolo("Angular Master");
        dev1.setAzienda(nextre);
        dev1.setContratto(new Contratto("009E","Quadro metalmeccanico",160,true));
        dev2.setCompensoConcordato(1999.98);

        dev2.setNome("Francesco");
        dev2.setCognome("Strazullo");
        dev2.setRuolo("Front-End Developer");
        dev2.setAzienda(nextre);
        dev2.setContratto(new Contratto("009E", "Terzo livello",160,true));
        dev2.setCompensoConcordato(1350.87);

        registro = new Dipendente[]{capo,contabile,commerciale,dev1,dev2};
    }
}//end class
