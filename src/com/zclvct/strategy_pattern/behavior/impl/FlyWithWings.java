package com.zclvct.strategy_pattern.behavior.impl;

import com.zclvct.strategy_pattern.behavior.FlyBehavior;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 一个算法  规定了如何飞的行为
 * @date 2021/9/4 16:38
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("煽动翅膀，我起飞了");
    }
}
