package org.guix.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/**
 * @author: Guix
 * @description: 抽奖活动单 持久化对象
 * @date: 2024/4/7 15:56
 * @version: 1.0
 */
@Data
public class RaffleActivityOrder {


    /**
     * 自增ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * sku
     */
    private Long sku;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 抽奖策略ID
     */
    private Long strategyId;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 总次数
     */
    private Integer totalCount;

    /**
     * 日次数
     */
    private Integer dayCount;

    /**
     * 月次数
     */
    private Integer monthCount;

    /**
     * 订单状态
     */
    private String state;

    /**
     * 业务仿重ID - 外部透传的，确保幂等
     */
    private String outBusinessNo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}