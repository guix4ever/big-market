package org.guix.domain.activity.service;

import org.guix.domain.activity.repository.IActivityRepository;
import org.springframework.stereotype.Service;

/**
 * @author: Guix
 * @description: 抽奖活动服务
 * @date: 2024/4/8 10:28
 * @version: 1.0
 */
@Service
public class RaffleActivityService extends AbstractRaffleActivity {

    public RaffleActivityService(IActivityRepository activityRepository) {
        super(activityRepository);
    }

}
