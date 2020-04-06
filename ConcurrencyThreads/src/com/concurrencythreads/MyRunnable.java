package com.concurrencythreads;

import static com.concurrencythreads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED+"Hello from my runnabble's implementation of Run() ");
    }
}
