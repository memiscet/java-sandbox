package com.memiscet;
import static  com.memiscet.Colors.*;


class oneMore implements Runnable {


    @Override
    public void run() {
        System.out.println(ANSI_RESET+" from a thread with an interface");
    }
}
