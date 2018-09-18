package it.nextre.academy.innestate;

public class Fumetto {

    static int numero_fumetti=9;
    int anni = 0;


    class Personaggio{
        String nome;
        String poterespeciale;

        //static int numero_personaggi=0; //devo rendere statica anche la classe innestata e quindi fare statica Personaggio

        public int getFumetti(){return numero_fumetti;};
        public String getInfo(){
            return "Eta' "+ Fumetto.this.anni;
        }
    }

    public static void main(String[] args) {

        Fumetto paperinik = new Fumetto();

        Personaggio p1 = paperinik.new Personaggio();
        Personaggio p2 = paperinik.new Personaggio();
        Personaggio p3 = paperinik.new Personaggio();

    }//end main

}//end class
