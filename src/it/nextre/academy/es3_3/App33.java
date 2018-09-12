package it.nextre.academy.es3_3;

public class App33 {

    public static void main(String[] args) {

        Elenco e = new Elenco(3,false);

        e.addItem("Ciao0");
        e.addItem("Ciao1");
        e.addItem("Ciao2");
        e.addItem("Ciao3");

        System.out.println(e.getItem(0));
        System.out.println(e.getItem(0).length());
        System.out.println(e.getItem(15).length());

        System.out.println("---------------------------------------------");

        Elenco e2 = new Elenco(3,true);
        e2.addItem(""+5);
        e2.addItem("zzx"+6);
        e2.addItem(""+7);


        System.out.println(e2.getIntItem(0));
        System.out.println(e2.getIntItem(1));
        System.out.println(e2.getIntItem(2));

    }//end main



}//end class
