package com.edu.Threaduse.wait_noyify_;

import java.util.concurrent.ArrayBlockingQueue;

public class Thread2 {
    public static void main(String[] args) {
        //创建阻塞队列，并指定队列大小
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        new Cook2(queue).start();
        new Foodie2(queue).start();
    }
}
