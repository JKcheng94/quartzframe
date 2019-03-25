package quartz.quartzframe.quartzclazz;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import quartz.quartzframe.DTO.QuartzDTO;
import quartz.quartzframe.factory.QuartzFactory;
import quartz.quartzframe.mapper.QuartzMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Copyright (C) 2018
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-07 19:20
 */
@Configuration
public class QuartzListener implements ApplicationRunner {
    
    @Resource
    private QuartzMapper quartzMapper;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("----- 服务启动！-----");
        //数据库获取定时任务信息
        List<QuartzDTO> quartzDTOS = quartzMapper.getJobData();
        for (QuartzDTO quartz : quartzDTOS) {
            System.out.println(quartz.getJobName() + " 定时任务启动------");
            QuartzFactory.quartzInstance(quartz);
        }
    }
}
