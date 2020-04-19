package com.memiscet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        calculateperf("ArrayList",arrayList);
        calculateperf( "LinkedList",linkedList );

    }

    public static void calculateperf(String data_type, List<Integer> list){

//add value to end of the list

        Long begin;
        Long end;
        begin =System.currentTimeMillis();
        for (int i=0; i<1000000;i++) {
            list.add(i);
        }
       end= System.currentTimeMillis();
        System.out.println("adding time  "+data_type+ (end-begin)+" ms");




    }
}
