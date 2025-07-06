package com.edu.Threaduse;

import java.util.AbstractList;
import java.util.ArrayList;

@SuppressWarnings({"all"})
public class Thread01 {
    public static void main(String[] args) {
        //这个时候就Cat就可以当作一个线程使用
        new Cat().start();
    }
}

//1.当一个类继承了Thread 类，该类就可以当作线程使用
//2.需要重写 run 方法，写上自己的业务代码
//3.run Thread类 实现了 Runnable 接口的run方法
class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {
        while (true){
            try {
                System.out.println("你好，我是"+ (++times));
                Thread.sleep(1000);//线程休眠1秒
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());//输出当前线程的名字
            //当times为8时，退出循环
            if (times == 80){
                break;
            }

        }


    }
}
