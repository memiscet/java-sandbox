package com.memiscet;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        //ArrayList <String> arraylist = new ArrayList <String>();
        List<String> list = new ArrayList<>();

        list.add( "Java");
        list.add( "Python" );
        list.add( "C++" );

       // System.out.println(list.get( 0 ));
        //System.out.println(list.get( 1 ));
        //System.out.println(list.get( list.size()-1 ));
        System.out.println("**************************");

        for (int i=0; i<list.size();i++){

            System.out.println(list.get( i ));
        }
        System.out.println("**************************");

        //using foreach
        list.remove( "Java" );
        list.add( "Go" );
        for (String item:list
             ) {
            System.out.println(item);
        }
        System.out.println("**************************");

    }
}
