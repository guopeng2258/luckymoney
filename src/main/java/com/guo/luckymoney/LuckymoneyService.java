package com.guo.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @ProjectName: luckymoney
 * @Package: com.guo.luckymoney
 * @ClassName: LuckymoneyService
 * @Author: gpy
 * @Description: ${description}
 * @Date: 19-5-1 下午9:05
 * @Version: 1.0
 */
@Service
@Transactional
public class LuckymoneyService {

    @Autowired
    private LuckymoneyRepository repository;

    public void createTwo(){
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("郭鹏远");
        luckymoney1.setMoney(new BigDecimal("520"));
        repository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("郭鹏远");
        luckymoney2.setMoney(new BigDecimal("1314"));
        repository.save(luckymoney2);
    }
}
