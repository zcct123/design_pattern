package com.zclvct.observer_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhaochong
 * @version 1.0
 * @description: TODO
 * @date 2021/9/6 10:09
 */
public abstract class WeatherDate implements Subject {

    public List<Observer> observers = new ArrayList<Observer>();

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void registerObserver(Observer observer) {
        lock.lock();
        try{
            if(observer == null)
            {
                throw new NullPointerException();
            }
            observers.add(observer);
        }finally {
            lock.unlock();
        }

    }

    @Override
    public void removeObserver(Observer observer) {
        lock.lock();
        try{
            int i = observers.indexOf(observer);
            observers.remove(i);
        }finally {
            lock.unlock();
        }
    }

    @Override
    public void notifyObserver(Object obj) {
        observers.forEach(observer -> {
            observer.update(this,obj);
        });
    }

    @Override
    public void notifyObserver() {
        notifyObserver(null);
    }
}
