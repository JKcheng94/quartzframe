package quartz.quartzframe.mapper;

import quartz.quartzframe.DTO.QuartzDTO;

import java.util.List;

/**
 * @Copyright (C) 2018
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-07 18:02
 */
public interface QuartzMapper {
    List<QuartzDTO> getJobData();
}
