package com.company.observer;

/**
 * Created by hasee on 2017/2/12.
 * 观察者接口,定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 */
public interface Observer {
    void update(Subject subject);
}
