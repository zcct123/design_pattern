package com.zclvct.strategy_pattern.behavior.impl;

import com.zclvct.strategy_pattern.behavior.QuackBehavior;

/**
 * @author zhaochong
 * @version 1.0
 * @description: TODO
 * @date 2021/9/4 16:40
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(" 嘎嘎嘎!");
    }
}
