package it.nextre.academy.ereditarieta;

public class Dipendente extends Persona{

    private Azienda azienda;
    private double compensoConcordato;
    private String ruolo;
    private Contratto contratto;

    public Dipendente(){};

    public Dipendente(Azienda azienda, double compensoConcordato, String ruolo, Contratto contratto) {
        this.azienda = azienda;
        this.compensoConcordato = compensoConcordato;
        this.ruolo = ruolo;
        this.contratto = contratto;
    }

    public Azienda getAzienda() {
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

    public Contratto getContratto() {
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
}//end class
