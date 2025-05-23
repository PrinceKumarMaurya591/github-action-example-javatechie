package com.cicd;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
       // Code to execute in the thread
       for (int i = 1; i <= 5; i++) {
        System.out.println(Thread.currentThread().getName() + ": " + i);
    }
}


}
