package com.hsenid.springScheduler.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//@Component
public class FixedDelayScheduledJob {
    Logger logger = LoggerFactory.getLogger(FixedDelayScheduledJob.class);
    @Scheduled(initialDelay = 3000, fixedDelay = 5000)
    public void fixedDelayScheduleJob(){
        logger.info("FixedDelayScheduledJob8 executed at time : " + LocalDateTime.now());
    }
}
