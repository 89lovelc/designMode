package com.hjh.observer;

import com.hjh.subject.Subject;
import com.hjh.subject.SubjectAbstracet;

public class Observer_1 implements ObserverInterface {
    @Override
    public void update(SubjectAbstracet subjectInterface) {
        System.out.println("获得气象局信息");
        System.out.println("我这个观察者observer2需要的东西是温度"+((Subject)subjectInterface).getTemperature());
    }
}
