package it.nextre.academy.anonime;

import it.nextre.academy.ereditarieta.Persona;

@FunctionalInterface
interface myInterface{
    public void doStuff(int x);
}
class TestInterface implements myInterface{
    @Override
    public void doStuff(int x) {

    }
}

public class AppAnonim {
    public static void main(String[] args) {

        myInterface m1 = new TestInterface();
        myInterface m2 = new myInterface() {
            @Override
            public void doStuff(int x) {

            }
        };






        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ciao dal Thread");
            }
        });




        Persona p = new Persona(){
            @Override
            public String getCognome() {
                return "riservato";
            }
        };






        int giri = 5;

        myInterface mx = (valore)->{
            for (int i = 9; i > valore; i--) {
                System.out.println(""+i);
            }//end for
        };

        System.out.println();

        Runnable r1 = ()->{
                    for (int i = 9; i > 0; i--) {
                        System.out.println(""+i);
                    }//end for
                };





        Thread t2 = new Thread();


        t1.start();
    }//end main
}//end class
