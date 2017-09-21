package com.cpb.example.R04.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * @author pengbo
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: TODO
 * @date ${date} ${time}
 */
public class JobListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("JobListener create time:" + jobExecution.getCreateTime());
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("JobListener status:" + jobExecution.getStatus().toString());
    }
}
