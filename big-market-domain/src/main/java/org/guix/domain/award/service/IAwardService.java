package org.guix.domain.award.service;

import org.guix.domain.award.model.entity.UserAwardRecordEntity;

/**
 * @author: Guix
 * @description: 奖品服务接口
 * @date: 2024/4/23 17:44
 * @version: 1.0
 */
public interface IAwardService {

    void saveUserAwardRecord(UserAwardRecordEntity userAwardRecordEntity);

}
