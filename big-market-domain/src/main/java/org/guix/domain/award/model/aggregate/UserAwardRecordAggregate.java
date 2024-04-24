package org.guix.domain.award.model.aggregate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.guix.domain.award.model.entity.TaskEntity;
import org.guix.domain.award.model.entity.UserAwardRecordEntity;

/**
 * @author: Guix
 * @description: 用户中奖记录聚合对象 【聚合代表一个事务操作】
 * @date: 2024/4/23 17:28
 * @version: 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAwardRecordAggregate {

    private UserAwardRecordEntity userAwardRecordEntity;

    private TaskEntity taskEntity;

}
