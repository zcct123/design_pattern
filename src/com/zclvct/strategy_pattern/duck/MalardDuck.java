package com.zclvct.strategy_pattern.duck;

import com.zclvct.strategy_pattern.behavior_able.Flyable;
import com.zclvct.strategy_pattern.behavior_able.Quackable;

/**
 * @author zhaochong
 * @version 1.0
 * @description: TODO
 * @date 2021/9/4 16:45
 */
public class MalardDuck extends Duck  implements Flyable, Quackable {

    @Override
    public void disPlay() {
        System.out.println(" 我是绿头鸭 ");
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void quack() {

    }
}
