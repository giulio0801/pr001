package it.nextre.academy.enumerazioni;

public class AppEnum {

    enum Formati {CSV,TXT,PNG,PDF};

    public static void main(String[] args) {

        String ext="csv";

        Formati formatoFile = Formati.valueOf(ext.toUpperCase());

        HttpMetodi metodo_chiamata = HttpMetodi.POST;

        if (metodo_chiamata instanceof Object){
            System.out.println("Enum è un object ");
        }

        if (metodo_chiamata instanceof HttpMetodi){
            System.out.println("metodo_chiamata è istanza di HttpMetodi");
        }

        if (metodo_chiamata == HttpMetodi.GET){
        }else{}


        System.out.println(metodo_chiamata);
        System.out.println(HttpMetodi.PATCH);

        test(null);

        if (formatoFile==Formati.CSV){}

        System.out.println(formatoFile.ordinal());






    }//end main

    public static void test(HttpMetodi metodo){
        System.out.println(metodo);
    }









}//end class
