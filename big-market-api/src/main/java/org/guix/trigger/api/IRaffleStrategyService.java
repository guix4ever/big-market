package org.guix.trigger.api;

import org.guix.trigger.api.dto.RaffleAwardListRequestDTO;
import org.guix.trigger.api.dto.RaffleAwardListResponseDTO;
import org.guix.trigger.api.dto.RaffleStrategyRequestDTO;
import org.guix.trigger.api.dto.RaffleStrategyResponseDTO;
import org.guix.types.model.Response;

import java.util.List;

/**
 * @author: Guix
 * @description: 抽奖服务接口
 * @date: 2024/3/30 16:12
 * @version: 1.0
 */
public interface IRaffleStrategyService {

    /**
     * 策略装配接口
     *
     * @param strategyId 策略ID
     * @return 装配结果
     */
    Response<Boolean> strategyArmory(Long strategyId);

    /**
     * 查询抽奖奖品列表配置
     *
     * @param requestDTO 抽奖奖品列表查询请求参数
     * @return 奖品列表数据
     */
    Response<List<RaffleAwardListResponseDTO>> queryRaffleAwardList(RaffleAwardListRequestDTO requestDTO);

    /**
     * 随机抽奖接口
     *
     * @param requestDTO 请求参数
     * @return 抽奖结果
     */
    Response<RaffleStrategyResponseDTO> randomRaffle(RaffleStrategyRequestDTO requestDTO);

}
