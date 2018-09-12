package it.nextre.academy.tmp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lambda {


    public static void main(String[] args) {
        List<Map> l = new ArrayList<>();

        Map<String,String> m1 = new HashMap<>();
        m1.put("valore","350");
        m1.put("nome","Mario");

        Map<String,String> m2 = new HashMap<>();
        m2.put("valore","5000");
        m2.put("nome","Mario");

        Map<String,String> m3 = new HashMap<>();
        m3.put("valore","3000");
        m3.put("nome","Mario");


        l.add(m1);
        l.add(m2);
        l.add(m3);





        for(Map tmp:l){
            System.out.println(tmp.get("valore"));
        }

        System.out.println(
            l.stream()
             .mapToDouble(e-> Double.parseDouble((String)e.get("valore")))
            .sum()
        );












    }//end main


}//end class
