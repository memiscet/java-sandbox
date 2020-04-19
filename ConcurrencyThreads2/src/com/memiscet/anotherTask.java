package com.memiscet;
import static com.memiscet.Colors.*;
public class anotherTask extends Thread{

    @Override
    public void run() {

        try{

            System.out.println(ANSI_PURPLE+"Thread"+Thread.currentThread().getName()+"is running");
        }
        catch (Exception e){

            System.out.println(e.getMessage()+" exception is caught");

        }
    }
}
