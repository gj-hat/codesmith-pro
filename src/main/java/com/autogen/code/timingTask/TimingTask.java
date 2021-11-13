package com.autogen.code.timingTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * @author ：JiaGuo
 * @date ：Created in 2021/11/14 00:57
 * @description：定时任务
 * @modified By：
 * @version: 1.0
 */
@Component
public class TimingTask {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private int i;

    @Scheduled(cron = "*/5 * * * * ?")
    public void execute() {
        logger.info("每隔5秒触发一次定时任务:第:{}次执行",  ++i);
    }
}
