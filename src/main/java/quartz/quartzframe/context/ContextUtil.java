package quartz.quartzframe.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Copyright (C) 2018
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-12 11:53
 */
@Component
public class ContextUtil implements ApplicationContextAware {
    
    private static ApplicationContext APPLICATIONCONTEXT;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        APPLICATIONCONTEXT = applicationContext;
    }
    
    public static ApplicationContext getApplicationContext(){
        return APPLICATIONCONTEXT;
    }
}
