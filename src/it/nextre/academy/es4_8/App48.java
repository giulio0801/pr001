package it.nextre.academy.es4_8;

import it.nextre.academy.ricorsione.MyUtils;

class App48 {

    public static void main(String[] args) {

        avviaMenu();

        double x,  u=10;

    }//end main

    private static void avviaMenu() {
        int scelta=0;
        boolean cicla = true;

        while(cicla){
            System.out.println("MEGA MENU descrizione....");
            System.out.println("1 - Scelta 1");
            System.out.println("2 - Scelta 2");
            System.out.println("3 - Scelta 3");
            System.out.println("4 - Scelta 4");
            System.out.println("5 - Scelta 5");
            System.out.println("6 - Scelta 6");
            System.out.println("7 - Scelta 7");
            System.out.println("8 - Scelta 8");
            System.out.println("9 - Esci");
            System.out.print("Seleziona una voce: ");

            switch (MyUtils.leggiInteroPositivo()){
                case 1:
                    System.out.println("Richiamo metodo 1");
                    break;
                case 2:
                    System.out.println("Richiamo metodo 2");
                    break;
                case 3:
                    System.out.println("Richiamo metodo 3");
                    break;
                case 4:
                    System.out.println("Richiamo metodo 4");
                    break;
                case 5:
                    System.out.println("Richiamo metodo 5");
                    break;
                case 6:
                    System.out.println("Richiamo metodo 6");
                    break;
                case 7:
                    System.out.println("Richiamo metodo 7");
                    break;
                case 8:
                    System.out.println("Richiamo metodo 8");
                    break;
                case 9:
                    System.out.println("Bye Bye");
                    cicla = false;
                    break;
                default:
                    System.out.println("Opzione non valida, riprova");
            }

        }
    }//fine metodo

}//end class
