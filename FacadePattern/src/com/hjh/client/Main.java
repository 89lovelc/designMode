package com.hjh.client;

import com.hjh.facade.SystemFacade;

/**
 * TODO 之后学会了 uml图 添加uml 添加优缺点
 *
 */
public class Main {
    public static void main(String[] args) {
        SystemFacade systemFacade = new SystemFacade();
        systemFacade.doSomeThingA();
        systemFacade.doSomeThingB();
        systemFacade.doSomeThingC();
    }
}
