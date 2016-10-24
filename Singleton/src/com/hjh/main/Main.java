package com.hjh.main;

import com.hjh.mode.Singleton;

/**
 * Created by 黄建辉 on 2016/10/24.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.peak();
    }
}
