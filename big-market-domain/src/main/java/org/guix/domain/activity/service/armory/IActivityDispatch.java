package org.guix.domain.activity.service.armory;

import java.util.Date;

/**
 * @author: Guix
 * @description: TODO
 * @date: 2024/4/20 14:25
 * @version: 1.0
 */
public interface IActivityDispatch {
    /**
     * 根据策略ID和奖品ID，扣减奖品缓存库存
     *
     * @param sku 互动SKU
     * @param endDateTime 活动结束时间，根据结束时间设置加锁的key为结束时间
     * @return 扣减结果
     */
    boolean subtractionActivitySkuStock(Long sku, Date endDateTime);

}
