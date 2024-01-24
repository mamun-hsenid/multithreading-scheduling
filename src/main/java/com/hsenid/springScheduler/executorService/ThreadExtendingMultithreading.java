package com.hsenid.springScheduler.executorService;

public class ThreadExtendingMultithreading extends Thread{
    private int threadNumber;
    public ThreadExtendingMultithreading(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Running thread extending Thread class : "+Thread.currentThread().getName()+" thread number - "+threadNumber);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
