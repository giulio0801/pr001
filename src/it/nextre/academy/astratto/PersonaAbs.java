package it.nextre.academy.astratto;

public abstract class PersonaAbs {

    private String nome;
    private String cognome;
    private String cf;
    private String telefono;

    public PersonaAbs() {}

    public PersonaAbs(String nome, String cognome, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.setCf(cf);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        if (cf.length() == 16)
            this.cf = cf;
        else
            System.out.println("Attenzione: codice fiscale non valido");
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public abstract void saluta();
}//end class
