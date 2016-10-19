package com.hjh.main;

import com.hjh.observer.Observer_1;
import com.hjh.observer.Observer_2;
import com.hjh.subject.Subject;

/**
 * Created by 黄建辉 on 2016/10/19.
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer_1 observer_1 = new Observer_1();
        Observer_2 observer_2 = new Observer_2();

        subject.addObserver(observer_1);
        subject.addObserver(observer_2);

        subject.updateSelf("36.5C","50");

    }

}
