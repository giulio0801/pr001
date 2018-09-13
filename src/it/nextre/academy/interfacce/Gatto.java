package it.nextre.academy.interfacce;

import java.io.Serializable;

public class Gatto extends Animale implements Saltante , Serializable {

    private int zampe;
    private String colore;
    private String nome;
    private int eta;

    @Override
    public void salta(){
        System.out.println("Ti salto sul mobile e ti rompo tutti i souvenir!!!");
    };


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


    public Gatto(){};
    public Gatto(String razza, int zampe) {
        super(razza);
        this.zampe = zampe;
    }

    @Override
    public String toString() {
        return "Gatto{" +
                "zampe=" + zampe +
                ", colore='" + colore + '\'' +
                ", nome='" + nome + '\'' +
                ", eta=" + eta +
                ", "+super.toString()+
                '}';
    }
}//end class
