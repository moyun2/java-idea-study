package com.edu.Threaduse.wait_noyify_;

import java.lang.Thread;
import java.util.concurrent.ArrayBlockingQueue;

public class Cook2 extends Thread {
    //定义列表
    ArrayBlockingQueue<String> queue;

    public Cook2(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        //不断做面条
        while (true) {
            try {
                queue.put("面条");
                System.out.println("厨师做完一碗面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
