package com.zclvct.strategy_pattern.duck;

/**
 * @author zhaochong
 * @version 1.0
 * @description: TODO
 * @date 2021/9/4 16:47
 */
public class RubberDuck extends Duck{

    @Override
    public void disPlay() {
        System.out.println(" 我是橡皮鸭 ");
    }

    @Override
    public void swim() {
        super.swim();
    }
}
