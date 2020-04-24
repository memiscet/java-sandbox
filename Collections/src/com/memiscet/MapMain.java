package com.memiscet;

import java.util.*;

public class MapMain {


    public static void mapPrinter(Map<Integer, String> map){

        map.put(10,"C++");
        map.put(5,"Java");
        map.put(1,"Python");
        map.put(2,"Php");
        map.put(100,"C");

        for (Map.Entry<Integer,String> entry:map.entrySet()){

            System.out.println("Anahtar : " + entry.getKey() + " ----------> Deger: "+entry.getValue());

        }
//Second way of printing the content.
        for (Integer key : map.keySet()){
            System.out.println("key is "+key+" value :" + map.get(key));
        }


        Collection <String > values = map.values();
        for (String s:values
             ) {
            System.out.println("Values..:"+s);
        }


    }



    public static void main(String[] args) {
        Map<Integer, String> hashmap = new HashMap<Integer, String>();
        Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer,String>();
        Map<Integer, String> treemap = new TreeMap<Integer, String>();

        System.out.println("**************hashmap******************");
        mapPrinter(hashmap);
        System.out.println("***************linkedhashmap*****************");
        mapPrinter(linkedhashmap);

        System.out.println("****************treemap****************");
        mapPrinter(treemap);

        System.out.println("********************************");



    }

}
