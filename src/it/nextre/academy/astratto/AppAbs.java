package it.nextre.academy.astratto;

public class AppAbs {
    public static void main(String[] args) {
        PersonaAbs p = new Dipendente2();
        PersonaAbs p2 = new PersonaAbs() {
            @Override
            public void saluta() {
                System.out.println("Ciao da classe anonima");
            }
        };

        p.saluta();
        p2.saluta();

    }//end main
}//end class
