package com.hjh.facade;

import com.hjh.subsystem.SystemA;
import com.hjh.subsystem.SystemB;
import com.hjh.subsystem.SystemC;

/**
 * 门面类 客户端调用这个角色的方法
 * 这个角色知道子系统的所有功能 和 责任 一般情况本角色会将所有从客户端发来的请求
 * 委派到响应的子系统中去，没有实际的业务逻辑 仅仅是一个委托类
 * 一定要记住 不能在其中写入业务逻辑
 */
public class SystemFacade {
    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();

    public void doSomeThingA(){
        this.systemA.doSomeThing();
    }
    public void doSomeThingB(){
        this.systemB.doSomeThing();
    }
    public void doSomeThingC(){
        this.systemC.doSomeThing();
    }

}
