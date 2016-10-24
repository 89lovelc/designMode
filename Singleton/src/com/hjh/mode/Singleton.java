package com.hjh.mode;

/**
 * 单一责任模式
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton(){}

    public void peak(){
        System.out.println("这是单一模式 在程序中只有一个实例的存在");
    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
