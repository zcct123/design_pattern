package com.zclvct.strategy_pattern.duck;

import com.zclvct.strategy_pattern.behavior.FlyBehavior;
import com.zclvct.strategy_pattern.behavior.QuackBehavior;
import com.zclvct.strategy_pattern.behavior.impl.FlyWithWings;
import com.zclvct.strategy_pattern.behavior.impl.Quack;

/**
 * @author zhaochong
 * @version 1.0
 * @description: TODO
 * @date 2021/9/4 16:35
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void swim(){
        System.out.println(" 我在有用");
    }

    public void disPlay() {
        System.out.println(" 我是白色的 ");
    }

    public void fly() {
        System.out.println(" 我是白色的 ");
    }

    public void performQuack() {quackBehavior.quack();}

    public void performFly() {flyBehavior.fly();}

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


}
