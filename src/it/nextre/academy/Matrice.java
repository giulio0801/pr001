package it.nextre.academy;

public class Matrice {
    public static void main(String[] args) {

        int[][] misurazioni = new int[7][];
        misurazioni[0] = new int[]{14,18,20,22,24,22,21};
        misurazioni[1] = new int[]{18,22,24};
        misurazioni[2] = new int[]{15,19,20,23,24,21};
        misurazioni[3] = new int[]{16};
        misurazioni[4] = new int[]{18,20,24,25};
        misurazioni[5] = new int[]{15,18,21,22,26,25,24};
        misurazioni[6] = new int[]{12,16,20,21,21,20,19,18,14};


        //ciclo giorni
        giorni: for(int i=0;i<misurazioni.length;i++){
            //System.out.println(misurazioni[i].length);
            double media=0;
            // ciclo temperature
            temp: for(int k=0;k<misurazioni[i].length;k++){
                System.out.print("\t"+misurazioni[i][k]);
                media+=misurazioni[i][k];
                //break giorni;
            }
            System.out.print(" => media "+media/misurazioni[i].length );
            System.out.println("");
        }


        // posso mettere in label anche gli statement
        /*
        test: {
            System.out.println("ciao1");
            break test;
        }
        */





    }//end main
}//end class
