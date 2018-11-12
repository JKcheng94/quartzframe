package quartz.quartzframe.jobs;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

/**
 * @Copyright (C) 2018
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-10 10:49
 */
@Component("testJob")
@DisallowConcurrentExecution
public class TestJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("测试job1------TestJob-----" + System.currentTimeMillis());
    }
}
