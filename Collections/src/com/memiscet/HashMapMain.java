package com.memiscet;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {


    public static void main(String[] args) {
        HashMap<Integer, String > hashMap = new HashMap<Integer, String>();
//we use put for hashmap when we want to add an object.


        hashMap.put( 10,"Java" );
        hashMap.put( 30,"Python" );
        hashMap.put( 20,"Php" );
        hashMap.put( 50,"Php" );
        hashMap.put( 50,"JavaScript" );


        System.out.println(hashMap.get( 10 ));
        System.out.println(hashMap.get( 20 ));
        System.out.println(hashMap.get( 30 ));
        System.out.println(hashMap.get( 40 ));
        System.out.println(hashMap.get( 50 ));
        System.out.println(hashMap);
        System.out.println("*****************************");
        for (Map.Entry<Integer,String> entry: hashMap.entrySet()){
            System.out.println("Anahtar : " + entry.getKey() + " ----------> Deger: "+entry.getValue());

        }

    }
}
