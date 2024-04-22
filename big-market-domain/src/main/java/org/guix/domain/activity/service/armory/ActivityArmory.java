package org.guix.domain.activity.service.armory;

import lombok.extern.slf4j.Slf4j;
import org.guix.domain.activity.model.entity.ActivitySkuEntity;
import org.guix.domain.activity.repository.IActivityRepository;
import org.guix.types.common.Constants;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author: Guix
 * @description: 活动sku预热
 * @date: 2024/4/20 14:26
 * @version: 1.0
 */
@Slf4j
@Service
public class ActivityArmory implements IActivityArmory, IActivityDispatch{
    @Resource
    private IActivityRepository activityRepository;

    @Override
    public boolean assembleActivitySku(Long sku) {
        // 预热活动sku库存
        ActivitySkuEntity activitySkuEntity = activityRepository.queryActivitySku(sku);
        cacheActivitySkuStockCount(sku, activitySkuEntity.getStockCount());

        // 预热活动【查询时预热到缓存】
        activityRepository.queryRaffleActivityByActivityId(activitySkuEntity.getActivityId());

        // 预热活动次数【查询时预热到缓存】
        activityRepository.queryRaffleActivityCountByActivityCountId(activitySkuEntity.getActivityCountId());

        return true;
    }

    private void cacheActivitySkuStockCount(Long sku, Integer stockCount) {
        String cacheKey = Constants.RedisKey.ACTIVITY_SKU_STOCK_COUNT_KEY + sku;
        activityRepository.cacheActivitySkuStockCount(cacheKey, stockCount);
    }

    @Override
    public boolean subtractionActivitySkuStock(Long sku, Date endDateTime) {
        String cacheKey = Constants.RedisKey.ACTIVITY_SKU_STOCK_COUNT_KEY + sku;
        return activityRepository.subtractionActivitySkuStock(sku, cacheKey, endDateTime);
    }


}
