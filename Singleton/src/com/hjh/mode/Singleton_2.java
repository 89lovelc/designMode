package com.hjh.mode;

/**
 * 单一责任模式
 */
public class Singleton_2 {
    private volatile static Singleton_2 singleton;
    private Singleton_2(){}

    public void peak(){
        System.out.println("这是单一模式 在程序中只有一个实例的存在");
    }

    public static Singleton_2 getInstance(){
        if(singleton == null){
            synchronized (Singleton_2.class){
                if(singleton == null){
                    return  new Singleton_2();
                }
            }
        }
        return singleton;
    }
}
