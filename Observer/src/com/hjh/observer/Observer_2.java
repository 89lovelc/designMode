package com.hjh.observer;

import com.hjh.subject.Subject;
import com.hjh.subject.SubjectAbstracet;

public class Observer_2 implements ObserverInterface {
    @Override
    public void update(SubjectAbstracet subjectInterface) {
        System.out.println("获得气象局信息");
        System.out.println("我这个观察者observer2需要的东西是湿度"+((Subject)subjectInterface).getHumidity());
    }
}
