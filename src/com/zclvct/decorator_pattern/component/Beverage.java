package com.zclvct.decorator_pattern.component;

/**
 * @author zhaochong
 * @version 1.0
 * @description:  装饰器模式   饮料的基类  抽象成分  component
 * @date 2021/9/8 16:22
 */
public abstract  class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     *  计算饮料的价格
     * @return
     */
    public abstract double cost();
}
