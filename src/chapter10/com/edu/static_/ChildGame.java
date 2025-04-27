package chapter10.com.edu.static_;

public class ChildGame {
    public static void main(String[] args) {
        int count = 0;
        Child A = new Child("小米");
        A.join();
        A.count++;
        Child B = new Child("a米");
        B.join();
        B.count++;
        System.out.println(Child.count);
    }
}


class Child {
    private String name;
    //定义一个类变量(静态变量)static 静态
    //这个可以被所有的对象访问
    public static int count = 0;
    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏。。。");
    }
}
