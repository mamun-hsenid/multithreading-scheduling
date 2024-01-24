package com.hsenid.springScheduler.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//@Component
public class OneTimeScheduledJob {
    Logger logger = LoggerFactory.getLogger(OneTimeScheduledJob.class);
    @Scheduled(initialDelay = 5000)
    public void oneTimeScheduledJob(){
        logger.info("OneTimeScheduledJob executed at time : " + LocalDateTime.now());
    }
}
