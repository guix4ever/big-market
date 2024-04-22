package org.guix.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.guix.infrastructure.persistent.po.RaffleActivitySku;

/**
 * @author: Guix
 * @description: 商品sku dao
 * @date: 2024/4/8 10:06
 * @version: 1.0
 */
@Mapper
public interface IRaffleActivitySkuDao {

    RaffleActivitySku queryActivitySku(Long sku);

    void updateActivitySkuStock(Long sku);

    void clearActivitySkuStock(Long sku);

}
