package com.counter;

public class Main {
    public static void main(String[] args) {

        Countdown countdown = new Countdown();
        CountdownThread t1 = new CountdownThread( countdown );
        t1.setName( "Thread 1" );
        CountdownThread t2 = new CountdownThread( countdown );
        t2.setName( "Thread 2" );

        t1.start();
        t2.start();

    }
}
class Countdown {
    private int i;
    public void doCountdown(){
String color;
        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_BLACK;
                break;
            case "Thread 3":
                color = ThreadColor.ANSI_GREEN;
                break;
            default:
                color = ThreadColor.ANSI_PURPLE;
        }
                for (i=10;i>0;i--){
                    System.out.println(color + Thread.currentThread().getName()+": i ="+i);
                                    }
        }
    }

class CountdownThread extends Thread {
    private Countdown threadCountdown;
    public CountdownThread(Countdown countdown){
        threadCountdown = countdown;
    }
    public void run(){
        threadCountdown.doCountdown();
    }
}