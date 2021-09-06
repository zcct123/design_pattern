package com.zclvct.observer_pattern;

/**
 * @author zhaochong
 * @version 1.0
 * @description: TODO
 * @date 2021/9/6 10:23
 */
public class FirstObserver implements Observer , Displable{


    @Override
    public void update(Subject subject, Object args) {
        //subject.getData  主动拉数据
        // args 参数获取 等待推数据
    }

    @Override
    public void display() {
        System.out.println("");
    }
}
