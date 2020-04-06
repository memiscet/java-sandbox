package com.concurrencythreads;
import static com.concurrencythreads.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread.");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName( "==another Thread==" );
        anotherThread.start();//you can't reuse this instance;

        System.out.println(ANSI_CYAN+"Hello again from the main thread");
        //if you will run the code once you can create an anonymous class.
        new Thread(  ){
            public void run(){
                System.out.println(ANSI_RED+"Hello again from the anonymous thread.");
                              }
                        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
          public void run(){
              System.out.println(ANSI_RED+"Hello from the anonymous class's implementation of run()");
              try {
                  anotherThread.join();
                  System.out.println(ANSI_RED+"AnotherThread terminated, so I'm running again.");
              }catch (InterruptedException e){
                  System.out.println(ANSI_RED +"I couldn't wait after all, I was interupted.");
              }
          }

        }



        );//you can pass the class as a constructor.
        myRunnableThread.start();

        System.out.println(ANSI_GREEN+"Hello again from the main thread");

    }
}
