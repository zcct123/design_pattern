package com.zclvct.observer_pattern;

/**
 * 观察者 接口
 */
public interface Observer {

    // 实现观察者 “拉” 或者 “推” 数据的功能
    public void update(Subject subject , Object args);

}
