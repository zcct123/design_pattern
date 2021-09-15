package com.zclvct.decorator_pattern.concrete_decorator;

import com.zclvct.decorator_pattern.component.Beverage;
import com.zclvct.decorator_pattern.decorator.CondimentDecorator;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 具体的装饰者 卡布奇诺
 * @date 2021/9/8 16:34
 */
public class Cappuccino extends CondimentDecorator {
    private Beverage beverage = null;    //用一个实例变量来记录饮料，也就是被装饰者

    public Cappuccino(Beverage beverage){
        this.beverage = beverage;    //通过构造函数将被装饰者实例化
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Cappuccino ";    //用来加上调料，一起描述饮料
    }

    @Override
    public double cost() {
        return 1.2 + beverage.cost();    //计算摩卡饮料的价钱，为卡布奇诺价钱 + 饮料价钱
    }
}
