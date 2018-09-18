package it.nextre.academy.eccezioni;

public class AppEcc {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        double ris=0;
        try {
            ris = blackBox(x, y);
        }catch(DivBy0Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("risultato: " + ris);
    }//end main


    public static double blackBox(int a, int b) throws DivBy0Exception {
        double tmp=0;
        if(b==0)
            throw new DivBy0Exception("divisione per zero rilevata");
        tmp = a/b;
        return tmp;
    }





    /* esempio vecchio
    *
    *
    * public static double blackBox(int a, int b){
        double tmp=0;
        try{
            if(b==0)
                throw new DivBy0Exception("divisione per zero rilevata");
            tmp = a/b;
        }catch (ArithmeticException | DivBy0Exception ex){
            System.out.println(ex.getMessage());
        } catch (NullPointerException e) {
            //e.printStackTrace(); // storia che ha portato a generare l'eccezione
        }catch(Exception ex){
            System.out.println("Eccezione non prevista");
        }finally{
            System.out.println("fine try/catch, ris: "+tmp);
        }
        return tmp;
    }
    *
    * */









}//end class




class DivBy0Exception extends Exception{
    public DivBy0Exception(){this("DivBy0Exception generated.");}
    public DivBy0Exception(String mex){super(mex);}
}