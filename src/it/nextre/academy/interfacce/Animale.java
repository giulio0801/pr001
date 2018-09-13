package it.nextre.academy.interfacce;

public abstract class Animale {
    private String razza;

    public Animale(){};
    public Animale(String razza){this.razza=razza;};

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    @Override
    public String toString() {
        return "Animale{" +
                "razza='" + razza + '\'' +
                '}';
    }
}//end class
