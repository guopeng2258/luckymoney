package com.guo.luckymoney;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @ProjectName: luckymoney
 * @Package: com.guo.luckymoney
 * @ClassName: LimitConfig
 * @Author: gpy
 * @Description: ${description}
 * @Date: 19-5-1 下午12:55
 * @Version: 1.0
 */
@Component
@ConfigurationProperties(prefix= "limit")
public class LimitConfig {

    private BigDecimal minMoney;

    private BigDecimal maxMoney;

    private String description;

    public BigDecimal getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(BigDecimal minMoney) {
        this.minMoney = minMoney;
    }

    public BigDecimal getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(BigDecimal maxMoney) {
        this.maxMoney = maxMoney;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
