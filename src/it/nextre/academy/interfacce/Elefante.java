package it.nextre.academy.interfacce;

public class Elefante extends Animale {

    private int zampe;
    private String colore;
    private String nome;
    private int eta;

    public Elefante() {}
    public Elefante(String razza, int zampe) {
        super(razza);
        this.zampe = zampe;
    }

    public int getZampe() {
        return zampe;
    }

    public void setZampe(int zampe) {
        this.zampe = zampe;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Elefante{" +
                "zampe=" + zampe +
                ", colore='" + colore + '\'' +
                ", nome='" + nome + '\'' +
                ", eta=" + eta +
                ", "+super.toString()+
                '}';
    }
}//end class
