package it.nextre.academy.es5_4;

public class Giocatore {

    private String nome;
    private double budget;


    private boolean inPartita;

    private Schedina schedina;

    private int v4,v5,v6,giocate;

    public Giocatore(String nome, double budget){
        this.nome=nome;
        this.budget=budget;
        this.inPartita=false;
        this.v4=0;
        this.v5=0;
        this.v6=0;
        this.giocate=0;
    }

    public boolean puoGiocare(double bet) {
        if (this.budget>=bet) {
            return true;
        }else{
            if(inPartita) {
                System.out.println("il giocatore " + this.getNome() + " esce dal gioco con " + this.getBudget() + " e BET a: " + bet);
            }
            inPartita=false;
            this.schedina=null;

            return false;
        }
    }


    private void setSchedina(Schedina nuovaSchedina) {
        this.schedina = nuovaSchedina;
    }

    public Schedina getSchedina() {
        return schedina;
    }

    public String getNome() {
        return nome;
    }

    public double getBudget(){
        return this.budget;
    }

    public void compraSchedina(double bet, Schedina schedina) {
        if(bet>0){
            this.budget -= bet;
            inPartita=true;
            setSchedina(schedina);
        }
    }

    public void addVincita(double compenso) {
        if(compenso>0)
            this.budget += compenso;
    }

    public boolean isInPartita(){
        return this.inPartita;
    }

    public void conteggia4(){this.v4++;}
    public void conteggia5(){this.v5++;}
    public void conteggia6(){this.v6++;}
    public void conteggiaGiocate(){this.giocate++;}

    public int getConteggia4(){return this.v4;}
    public int getConteggia5(){return this.v5;}
    public int getConteggia6(){return this.v6;}
    public int getGiocate(){return this.giocate;}


}//end class
