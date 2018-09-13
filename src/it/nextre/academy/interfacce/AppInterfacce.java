package it.nextre.academy.interfacce;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AppInterfacce {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        Object cat = new Gatto("Siamese",4);
        Elefante elephant = new Elefante("Africano",4);

        Saltante[] jumper = new Saltante[]{(Saltante)cat};

        for(Saltante j:jumper){
            j.salta();
        }

    }//end main
}//end class
