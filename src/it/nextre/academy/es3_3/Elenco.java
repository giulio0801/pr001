package it.nextre.academy.es3_3;

public class Elenco {

    private String[] db;
    private int pos;
    private boolean isInt; //true  x interi , false x le strighe

    public Elenco(int lunghezza, boolean numerica){
        this.db=new String[lunghezza];
        this.pos=0;
        this.isInt=numerica;

    }

    public boolean addItem(String item){

        if(isInt && !isNumero(item))return false;

        if(this.pos<this.db.length){
            this.db[pos]=item;
            pos++;
            return true;
        }
        return false;



        /*
        //funziona, magari usare una booleana di classe x dire se è piena
        if(piena) return false;
        for(int i = 0; i<db.length;i++){
            if(this.db[i]==null) {
                this.db[i] = item;
                return true;
            }
        }
        //piena=true;
        return false;
        */
    }

    private boolean isNumero(String item) {
        boolean isNumero=true;
        for(int i=0;i<item.length();i++){
            String x = ""+item.charAt(i);
            if(i==0 && (x=="+" || x=="-"))continue;
            if(x.charAt(0)>=48 && x.charAt(0)<=57) return true;
            else{
                isNumero=false;
                break;
            }
        }
        return isNumero;
    }

    public String[] getItems(){
        return this.db;
    }


    public String getItem(int pos){
        if(pos>=0 && pos<this.db.length)
        return this.db[pos];
        else return "";
    }

    public Integer getIntItem(int pos){
        if(this.db[pos]!=null && pos>=0 && pos<this.db.length)
            return Integer.parseInt(this.db[pos]);
        else return null;
    }


}//end class
