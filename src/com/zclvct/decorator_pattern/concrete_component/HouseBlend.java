package com.zclvct.decorator_pattern.concrete_component;

import com.zclvct.decorator_pattern.component.Beverage;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 黑咖啡
 * @date 2021/9/8 16:30
 */
public class HouseBlend extends Beverage {

    String description = "is HouseBlend";


    @Override
    public double cost() {
        return 5.5d;
    }
}
