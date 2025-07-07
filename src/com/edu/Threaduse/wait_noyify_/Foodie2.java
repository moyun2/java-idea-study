package com.edu.Threaduse.wait_noyify_;

import java.lang.Thread;
import java.util.concurrent.ArrayBlockingQueue;

public class Foodie2 extends Thread {
    //定义列表
    ArrayBlockingQueue<String> queue;

    public Foodie2(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        //不断吃面条
        while (true) {
            try {
                String take = queue.take();
                System.out.println(take);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
