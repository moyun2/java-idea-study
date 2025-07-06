package com.edu.Threaduse;

public class Thread03 {
    public static void main(String[] args) {
        new T1().start();
        new T2().start();
    }
}


class T1 extends Thread {
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("hello word-线程=" + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ++count;
            if (count == 10)
                break;
        }
    }
}

class T2 extends Thread {
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("hi-线程="+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ++count;
            if (count == 5)
                break;
        }
    }
}
