package com.hsenid.springScheduler.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//@Component
public class FixedRateScheduledJob {
    Logger logger = LoggerFactory.getLogger(FixedDelayScheduledJob.class);
    @Scheduled(initialDelay = 10000, fixedRate = 5000)
    public void fixedRateScheduledJob(){
        logger.info("FixedRateScheduledJob executed at time : " + LocalDateTime.now());
    }

}
