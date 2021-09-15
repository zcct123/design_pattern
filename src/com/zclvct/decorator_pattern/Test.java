package com.zclvct.decorator_pattern;

import com.zclvct.decorator_pattern.component.Beverage;
import com.zclvct.decorator_pattern.concrete_component.Espresso;
import com.zclvct.decorator_pattern.concrete_decorator.Cappuccino;
import com.zclvct.decorator_pattern.concrete_decorator.Mocha;

/**
 * @author zhaochong
 * @version 1.0
 * @description: TODO
 * @date 2021/9/8 16:35
 */
public class Test {
    public static void main(String[] args) {

        //简单要一杯浓咖啡
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + "$" +  beverage1.cost());

        //两份摩卡加一份卡布奇诺的浓咖啡
        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Cappuccino(beverage2);
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());

    }
}
