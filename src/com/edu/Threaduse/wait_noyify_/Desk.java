package com.edu.Threaduse.wait_noyify_;

public class Desk {
    public static Object lock = new Object();//用来作对象锁
    //0:表示没有面 1：表示有面
    public static int zt = 1;
    //最终面的碗数
    public static int count = 10;
}
