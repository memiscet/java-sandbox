package com.memiscet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {


    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();

        set1.add( "Java" );
        set1.add("Python");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add( "Php");
        set1.add( "VisualBasic");

        set2.add( "Java" );
        set2.add("Python");
        set2.add("C++");
        set2.add("JavaScript");
        set2.add( "Php");
        set2.add( "CSS");
        set2.add( "Pascal");
        set2.add( "Turbo C");




        set3.add( "Java" );
        set3.add("Python");
        set3.add("C++");
        set3.add("JavaScript");
        set3.add( "Php");
        set3.add( "Delphi");

        System.out.println("*********HashSet*************");
        for (String s:set1
             ) {
            System.out.println(s);

        }
        System.out.println("*********LinkedHashSet*************");

        for (String s:set2
        ) {
            System.out.println(s);

        }
        System.out.println("*********TreeSet*************");
        for (String s:set3
        ) {
            System.out.println(s);

        }


Set <String> distinct = new HashSet<String >(set1);
Set <String> unity = new HashSet<String >(set1);


        System.out.println(distinct.removeAll( set2 ));
        System.out.println(unity.retainAll( set2 ));
        System.out.println("distinct..:"+distinct);
        System.out.println("unity..:"+unity);

    }
}
