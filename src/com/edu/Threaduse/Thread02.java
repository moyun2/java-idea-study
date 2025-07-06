package com.edu.Threaduse;

public class Thread02 {
    public static void main(String[] args) {
//        Dog dog = new Dog();//创建dog对象
        //由于Runnable没有start方法，所以要通过创建Thread对象来调用start方法
//        new Thread(dog).start();
        new PorxyThread(new Tiger()).start();
    }
}

class Dog implements Runnable {
    int count;
    @Override
    public void run() {
        while (true) {
            System.out.println("你好，当前线程="+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ++count;
            if (count > 20)
                break;
        }
    }
}

class PorxyThread implements Runnable {

    private Runnable target = null;
    @Override
    public void run(){
        if (target != null){
            target.run();
        }
    }

    public PorxyThread(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();
    }
    public void start0() {
        run();
    }
}

class Tiger implements Runnable {
    @Override
    public void run() {
        System.out.println("老虎...." + Thread.currentThread().getName());
    }
}
