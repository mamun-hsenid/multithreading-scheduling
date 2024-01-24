package com.hsenid.springScheduler.executorService;

public class RunnableImplementingMultithreading  implements Runnable{
    private int threadNumber;
    public RunnableImplementingMultithreading(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Running runnable thread " + Thread.currentThread().getName()+" thread number - "+threadNumber);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
