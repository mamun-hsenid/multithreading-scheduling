package com.hsenid.springScheduler;

import com.hsenid.springScheduler.configuration.AppConfig;
import com.hsenid.springScheduler.executorService.RunnableImplementingMultithreading;
import com.hsenid.springScheduler.executorService.ThreadExtendingMultithreading;
import com.hsenid.springScheduler.scheduler.OneTimeScheduledJob;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {OneTimeScheduledJob.class, AppConfig.class})
public class SpringScedulerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringScedulerApplication.class, args);

        for (int i = 0; i <5 ; i++) {
            System.out.println("Running main thread : "+Thread.currentThread().getName());
        }
        for (int i = 0; i <3 ; i++) {
            RunnableImplementingMultithreading runnableThread = new RunnableImplementingMultithreading(i);
            Thread mythread2 = new Thread(runnableThread);

            mythread2.start();

            ThreadExtendingMultithreading myThread1 = new ThreadExtendingMultithreading(i);
            myThread1.start();

        }

    }
}
