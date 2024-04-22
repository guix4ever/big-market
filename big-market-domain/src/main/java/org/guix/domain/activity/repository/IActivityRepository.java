package org.guix.domain.activity.repository;

import org.guix.domain.activity.model.aggregate.CreateOrderAggregate;
import org.guix.domain.activity.model.entity.ActivityCountEntity;
import org.guix.domain.activity.model.entity.ActivityEntity;
import org.guix.domain.activity.model.entity.ActivitySkuEntity;
import org.guix.domain.activity.model.valobj.ActivitySkuStockKeyVO;

import java.util.Date;

/**
 * @author: Guix
 * @description: 活动仓储接口
 * @date: 2024/4/8 10:26
 * @version: 1.0
 */
public interface IActivityRepository {


    ActivitySkuEntity queryActivitySku(Long sku);

    ActivityEntity queryRaffleActivityByActivityId(Long activityId);

    ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId);

    void doSaveOrder(CreateOrderAggregate createOrderAggregate);

    void cacheActivitySkuStockCount(String cacheKey, Integer stockCount);

    boolean subtractionActivitySkuStock(Long sku, String cacheKey, Date endDateTime);

    void activitySkuStockConsumeSendQueue(ActivitySkuStockKeyVO activitySkuStockKeyVO);

    ActivitySkuStockKeyVO takeQueueValue();

    void clearQueueValue();

    void updateActivitySkuStock(Long sku);

    void clearActivitySkuStock(Long sku);
}
