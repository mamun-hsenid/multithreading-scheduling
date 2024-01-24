package com.hsenid.springScheduler.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

//@Component
public class CronScheduledJob {
    Logger logger = LoggerFactory.getLogger(FixedDelayScheduledJob.class);

//    Cron time breakdown : second minute hour dayOfMonth month dayOfWeek [year]

    @Scheduled(cron = "50 22 00 * * *")
    public void cronScheduledJob(){
        logger.info("CronScheduledJob executed at time : " + LocalDateTime.now());
    }
}
