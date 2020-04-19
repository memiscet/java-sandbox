package com.memiscet;
import static com.memiscet.Colors.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("I am from the main thread");


        new Thread(  ){
            public void run(){
                System.out.println(ANSI_BLUE+"Hello again from the anonymous thread.");
            }
        }.start();

        for (int i=0;i<10;i++){
            Thread object = new anotherTask();
            object.start();
        }

        oneMore oneMoree = new oneMore();
        oneMoree.run();

    }
}
