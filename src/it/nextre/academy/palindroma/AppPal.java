package it.nextre.academy.palindroma;

public class AppPal {

    public static void main(String[] args) {
        String test = "itopinonavevanonipoti";
        String reverse = "";
        int length = test.length();
        for(int i = length-1 ;i>=0;i--){
            reverse+=test.charAt(i);
        }
        if (test.equals(reverse)){
            System.out.println("PALINDROMA");
        }else{
            System.out.println("NON PALINDROMA");
        }
    }//end main

}//end class
