package org.guix.domain.award.repository;

import org.guix.domain.award.model.aggregate.UserAwardRecordAggregate;

/**
 * @author: Guix
 * @description: TODO
 * @date: 2024/4/23 17:28
 * @version: 1.0
 */
public interface IAwardRepository {

    void saveUserAwardRecord(UserAwardRecordAggregate userAwardRecordAggregate);

}
