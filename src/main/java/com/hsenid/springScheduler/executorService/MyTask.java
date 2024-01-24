package com.hsenid.springScheduler.executorService;

public class MyTask implements Runnable{
    private int threadNumber;

    public MyTask(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        System.out.println("Running my my  " + Thread.currentThread().getName()+" at thread no - "+threadNumber);
    }
}
