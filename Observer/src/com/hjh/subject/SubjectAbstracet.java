package com.hjh.subject;


import com.hjh.observer.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectAbstracet {

    List<ObserverInterface> list =  new ArrayList<ObserverInterface>();

    public void addObserver(ObserverInterface observerInterface ){
        list.add(observerInterface);
    }

    public void notifyAllObserver(){
        for(ObserverInterface observerInterface:list){
            observerInterface.update(this);
        }
    }
}