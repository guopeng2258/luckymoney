package com.guo.luckymoney;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ProjectName: luckymoney
 * @Package: com.guo.luckymoney
 * @ClassName: LuckymoneyRepository
 * @Author: gpy
 * @Description: ${description}
 * @Date: 19-5-1 下午7:38
 * @Version: 1.0
 */


public interface LuckymoneyRepository extends JpaRepository<Luckymoney,Integer> {
}
