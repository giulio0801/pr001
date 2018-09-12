package it.nextre.academy;

import java.util.Objects;

public class Utente {

    String nome;
    int anni;



    {
        System.out.println("Stò per creare un Utente");
    }



    static {
        System.out.println("Carico la classe utente");
        code = "002502254";
    }
    static String code;

    public Utente(String nome, int anni) {
        this.nome = nome;
        this.anni = anni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnni() {
        return anni;
    }

    public void setAnni(int anni) {
        this.anni = anni;
    }

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utente utente = (Utente) o;
        return getAnni() == utente.getAnni() &&
                Objects.equals(getNome(), utente.getNome());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNome(), getAnni());
    }

    */
}//end class
