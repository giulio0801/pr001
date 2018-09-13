package it.nextre.academy.astratto;

import it.nextre.academy.ereditarieta.Azienda;
import it.nextre.academy.ereditarieta.Contratto;
import it.nextre.academy.ereditarieta.Persona;

public class Dipendente2 extends PersonaAbs {

    private it.nextre.academy.ereditarieta.Azienda azienda;
    private double compensoConcordato;
    private String ruolo;
    private it.nextre.academy.ereditarieta.Contratto contratto;

    public Dipendente2(){};

    public Dipendente2(it.nextre.academy.ereditarieta.Azienda azienda, double compensoConcordato, String ruolo, it.nextre.academy.ereditarieta.Contratto contratto) {
        this.azienda = azienda;
        this.compensoConcordato = compensoConcordato;
        this.ruolo = ruolo;
        this.contratto = contratto;
    }

    public it.nextre.academy.ereditarieta.Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }

    public double getCompensoConcordato() {
        return compensoConcordato;
    }

    public void setCompensoConcordato(double compensoConcordato) {
        if(compensoConcordato>=0) {
            this.compensoConcordato = compensoConcordato;
        }else{
            System.out.println("Attenzione: compenso non corretto, impostare un valore maggiore o pari a 0.0");
        }
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public it.nextre.academy.ereditarieta.Contratto getContratto() {
        return contratto;
    }

    public void setContratto(Contratto contratto) {
        this.contratto = contratto;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "nome=" + getNome() +
                ", cognome=" + getCognome() +
                ", cf=" + getCf() +
                ", azienda=" + azienda +
                ", compensoConcordato=" + compensoConcordato +
                ", ruolo='" + ruolo + '\'' +
                ", contratto=" + contratto +
                '}';
    }

    @Override
    public void saluta() {
        System.out.println("Ciao da dipendente");
    }



}//end class
