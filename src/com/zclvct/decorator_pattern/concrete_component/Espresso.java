package com.zclvct.decorator_pattern.concrete_component;

import com.zclvct.decorator_pattern.component.Beverage;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 浓咖啡   具体成分  concrete_component
 * @date 2021/9/8 16:26
 */
public  class Espresso extends Beverage {
    String description = "is Espresso";

    @Override
    public double cost() {
        return 5.0d;
    }
}
