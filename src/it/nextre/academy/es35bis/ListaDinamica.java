package it.nextre.academy.es35bis;

public class ListaDinamica {

    String[] db;

    public ListaDinamica() {
        this.db = new String[1];
    }

    public void add(String parola) {
        if (db[db.length-1]==null){
            db[db.length-1] = parola;
        }else{
            String[] tmp = new String[db.length+1];
            for(int i=0;i<db.length;i++){
                tmp[i]=db[i];
            }
            db=tmp;
            //tmp[db.length]=parola; //* todo fare richiamoa me stesso
            add(parola);
        }
    }

    public void stampaContenuto() {
        for(int i=0;i<db.length;i++){
            System.out.println(db[i]);
        }
    }
}//end class
