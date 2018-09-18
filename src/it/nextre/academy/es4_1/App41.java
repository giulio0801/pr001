package it.nextre.academy.es4_1;

public class App41 {
    public static void main(String[] args) throws Exception {
        //example2();
        //example3();
        example4();

    }

    public static void examplel() {
        int k = 0;
        int y = 2;
        /*
       if (y && (k) < 3) {
           System.out.println(k + y);
       }
       */
    }

    public static void example2(){
        int k=0;
        System.out.println(false && k++>k);

    }

    public static void example3(){
        int k=0;
        System.out.println(false & ++k>k);
    }

    public static void example4(){
        int k=0;
        System.out.println(++k > k);



        k=3;
        k=k++;
        System.out.println(k);

        int [] j [] =new int[1][];
        j[0]=new int[]{1,2,3};

    }
}//end class
