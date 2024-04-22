package org.guix.domain.activity.service;

import org.guix.domain.activity.model.valobj.ActivitySkuStockKeyVO;

/**
 * @author: Guix
 * @description: 活动sku库存处理接口
 * @date: 2024/4/20 15:09
 * @version: 1.0
 */
public interface ISkuStock {
    /**
     * 获取活动sku库存消耗队列
     *
     * @return 奖品库存Key信息
     * @throws InterruptedException 异常
     */
    ActivitySkuStockKeyVO takeQueueValue() throws InterruptedException;

    /**
     * 清空队列
     */
    void clearQueueValue();

    /**
     * 延迟队列 + 任务趋势更新活动sku库存
     *
     * @param sku 活动商品
     */
    void updateActivitySkuStock(Long sku);

    /**
     * 缓存库存以消耗完毕，清空数据库库存
     *
     * @param sku 活动商品
     */
    void clearActivitySkuStock(Long sku);
}
