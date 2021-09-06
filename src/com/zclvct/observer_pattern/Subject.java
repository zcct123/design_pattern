package com.zclvct.observer_pattern;

import java.awt.*;
import java.util.ArrayList;

/*
 * 主题接口 ： 用于事件发布 、 观察者绑定、解绑
 */
public interface Subject {

    // 注册
    public void  registerObserver(Observer observer);
    // 删除
    public void  removeObserver(Observer observer);
    // 发布
    public void  notifyObserver(Object obj);

    public void  notifyObserver();
}
