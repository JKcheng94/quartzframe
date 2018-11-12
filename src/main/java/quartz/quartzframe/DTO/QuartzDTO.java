package quartz.quartzframe.DTO;

/**
 * @Copyright (C) 2018
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-07 17:45
 */
public class QuartzDTO {
    
    private int id;
    
    private String jobName;
    
    private String jobGroupName;
    
    private String triggerName;
    
    private String triggerGroupName;
    
    private String expression;
    
    private String className;
    
    private int enable;
    
    public int getEnable() {
        return enable;
    }
    
    public void setEnable(int enable) {
        this.enable = enable;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getJobName() {
        return jobName;
    }
    
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    
    public String getJobGroupName() {
        return jobGroupName;
    }
    
    public void setJobGroupName(String jobGroupName) {
        this.jobGroupName = jobGroupName;
    }
    
    public String getTriggerName() {
        return triggerName;
    }
    
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }
    
    public String getTriggerGroupName() {
        return triggerGroupName;
    }
    
    public void setTriggerGroupName(String triggerGroupName) {
        this.triggerGroupName = triggerGroupName;
    }
    
    public String getExpression() {
        return expression;
    }
    
    public void setExpression(String expression) {
        this.expression = expression;
    }
    
    public String getClassName() {
        return className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }
}
