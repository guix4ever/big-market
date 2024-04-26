package org.guix.trigger.api;

import org.guix.trigger.api.dto.ActivityDrawRequestDTO;
import org.guix.trigger.api.dto.ActivityDrawResponseDTO;
import org.guix.types.model.Response;

/**
 * @author: Guix
 * @description: 抽奖活动服务
 * @date: 2024/4/25 14:42
 * @version: 1.0
 */
public interface IRaffleActivityService {

    /**
     * 活动装配，数据预热缓存
     * @param activityId 活动ID
     * @return 装配结果
     */
    Response<Boolean> armory(Long activityId);

    /**
     * 活动抽奖接口
     * @param request 请求对象
     * @return 返回结果
     */
    Response<ActivityDrawResponseDTO> draw(ActivityDrawRequestDTO request);

}
