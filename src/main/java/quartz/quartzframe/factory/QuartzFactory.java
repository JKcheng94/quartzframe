package quartz.quartzframe.factory;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.ApplicationContext;
import quartz.quartzframe.DTO.QuartzDTO;
import quartz.quartzframe.context.ContextUtil;

/**
 * @Copyright (C) 2018
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-10 10:01
 */
public class QuartzFactory {
    
    public static void quartzInstance(QuartzDTO quartzDTO) {
        String jobName = quartzDTO.getJobName();
        String jobGroupName = quartzDTO.getJobGroupName();
        String triggerName = quartzDTO.getTriggerName();
        String triggerGroupName = quartzDTO.getTriggerGroupName();
        String expression = quartzDTO.getExpression();
        //beanid
        String className = quartzDTO.getClassName();
        //获取当前spring上下文
        ApplicationContext webContexta = ContextUtil.getApplicationContext();
        //通过spring容器获取class
        Class clazz = webContexta.getBean(className).getClass();
        
        //构建quartz
        StdSchedulerFactory stdSchedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = null;
        try {
            scheduler = stdSchedulerFactory.getScheduler();
            JobDetail jobDetail = JobBuilder.newJob(clazz).withIdentity(jobName, jobGroupName).build();
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity(triggerName, triggerGroupName)
                    .withSchedule(CronScheduleBuilder.cronSchedule(expression))
                    .startNow().build();
            scheduler.scheduleJob(jobDetail, trigger);
            scheduler.start();
        } catch (SchedulerException e) {
            System.out.println("quartz构建出错了！\n" + e);
            e.printStackTrace();
        }
    }
}
