package it.nextre.academy.ereditarieta;

public class Contratto {

    private String codiceContratto;
    private String nome;
    private int oreMensili;
    private boolean fulltime;

    public Contratto(String codiceContratto, String nome, int oreMensili, boolean fulltime) {
        this.codiceContratto = codiceContratto;
        this.nome = nome;
        this.oreMensili = oreMensili;
        this.fulltime = fulltime;
    }

    @Override
    public String toString() {
        return "Contratto{" +
                "codiceContratto='" + codiceContratto + '\'' +
                ", nome='" + nome + '\'' +
                ", oreMensili=" + oreMensili +
                ", fulltime=" + fulltime +
                '}';
    }

    public String getCodiceContratto() {
        return codiceContratto;
    }

    public void setCodiceContratto(String codiceContratto) {
        this.codiceContratto = codiceContratto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOreMensili() {
        return oreMensili;
    }

    public void setOreMensili(int oreMensili) {
        this.oreMensili = oreMensili;
    }

    public boolean isFulltime() {
        return fulltime;
    }

    public void setFulltime(boolean fulltime) {
        this.fulltime = fulltime;
    }
}//end class
