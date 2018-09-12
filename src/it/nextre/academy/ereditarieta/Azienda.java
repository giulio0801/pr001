package it.nextre.academy.ereditarieta;

public class Azienda {
    private String ragioneSociale;
    private String IndirizzoSedeLegale;
    private String partitaIva;
    private int dipendenti;

    public Azienda(){}
    public Azienda(String ragioneSociale){
        this.ragioneSociale=ragioneSociale;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getIndirizzoSedeLegale() {
        return IndirizzoSedeLegale;
    }

    public void setIndirizzoSedeLegale(String indirizzoSedeLegale) {
        IndirizzoSedeLegale = indirizzoSedeLegale;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public int getDipendenti() {
        return dipendenti;
    }

    public void setDipendenti(int dipendenti) {
        this.dipendenti = dipendenti;
    }

    public String toString1(){
        return this.ragioneSociale+" ( "+this.partitaIva + " ) ";
    }


    @Override
    public String toString() {
        return "Azienda{" +
                "ragioneSociale='" + ragioneSociale + '\'' +
                ", IndirizzoSedeLegale='" + IndirizzoSedeLegale + '\'' +
                ", partitaIva='" + partitaIva + '\'' +
                ", dipendenti=" + dipendenti +
                '}';
    }
}//end class
