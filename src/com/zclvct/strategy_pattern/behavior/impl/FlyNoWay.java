package com.zclvct.strategy_pattern.behavior.impl;

import com.zclvct.strategy_pattern.behavior.FlyBehavior;

/**
 * @author zhaochong
 * @version 1.0
 * @description:
 * @date 2021/9/4 16:39
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" oh 不 ， 我不会飞");
    }
}
