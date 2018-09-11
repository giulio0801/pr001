package it.nextre.academy;

public class Operatori {


    public static void main(String[] args) {



        boolean v = true;
        int x=3;
        int y=5,z=8;
        String txt1 = "Ciao";

        switch (txt1){
            case "Ciao":
                System.out.println("A");
                break;
            case "CIAO":
                System.out.println("B");
                break;
            case "ciao":
                System.out.println("C");
                break;
            default:
                System.out.println("-1");
        }











        double d = (double) 3 + 1;

        if (v==true | logga(x)){
            System.out.println("VERO");
        }
        System.out.println(x);
        do{
            System.out.println("giro");
            System.out.println("..... "+x+" , "+y);
            x--;
            y--;
        }while(x>0 && y >= 5);

        System.out.println(x+" , "+y);
    }//end main












    private static boolean logga(int x) {
        System.out.println("Log in console: " + x++);
        return true;
    }


}//end class
