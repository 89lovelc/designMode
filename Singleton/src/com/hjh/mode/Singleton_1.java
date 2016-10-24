package com.hjh.mode;

/**
 * 单一责任模式
 */
public class Singleton_1 {
    private static Singleton_1 singleton = new Singleton_1();
    private Singleton_1(){}

    public void peak(){
        System.out.println("这是单一模式 在程序中只有一个实例的存在");
    }

    public static Singleton_1 getInstance(){
        return singleton;
    }
}
