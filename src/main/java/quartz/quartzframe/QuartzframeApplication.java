package quartz.quartzframe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("quartz.quartzframe.mapper")
public class QuartzframeApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(QuartzframeApplication.class, args);
    }
}
