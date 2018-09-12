package it.nextre.academy.es35bis;

public class App {

    public static void main(String[] args) {
        //creare un contenitore di stringhe
        ListaDinamica ld = new ListaDinamica();
        //ld.stampaContenuto();

        //aggiungere al contenitore delle stringhe
        // cont.add("ciao");
        // cont.add("ciao1");
        // cont.add("ciao2");

        ld.add("AAA");
        ld.add("BBB");
        ld.add("CCC");
        ld.add("DDD");
        ld.add("EEE");
        ld.add("FFF");



        //stampare il contenuto del contenitore
        // cont.stampa();
        ld.stampaContenuto();



    }//end main

}//end class
