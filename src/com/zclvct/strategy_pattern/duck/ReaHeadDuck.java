package com.zclvct.strategy_pattern.duck;

/**
 * @author zhaochong
 * @version 1.0
 * @description: TODO
 * @date 2021/9/4 16:46
 */
public class ReaHeadDuck extends Duck{

    @Override
    public void disPlay() {
        System.out.println(" 我是红头鸭 ！");
    }

    @Override
    public void swim() {
        super.swim();
    }
}
