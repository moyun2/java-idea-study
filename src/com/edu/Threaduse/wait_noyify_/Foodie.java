package com.edu.Threaduse.wait_noyify_;

import java.lang.Thread;

public class Foodie extends Thread {
    /**
     * 多线程代码流程
     * 1.循环
     * 2.同步代码块(同步方法)
     * 3.判断共享数据是否到了末尾（到了末尾）
     * 3.判断共享数据是否到了末尾（没有到末尾）
     */
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count == 0){
                    break;
                }else {
                    /**
                     * 先判断桌子上有没有食物
                     * 如果没有就等待
                     * 如果有，就开吃
                     * 次数-1
                     * 吃完唤醒厨师
                     * 改变桌子的状态
                     */
                    if (Desk.zt == 0){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }else {
                        Desk.count--;
                        System.out.println("吃货正在吃，还剩"+Desk.count+"碗");
                        Desk.lock.notifyAll();//唤醒所有线程 notify()随机唤醒一个线程
                        Desk.zt = 0;
                    }
                }
            }
        }
    }
}
