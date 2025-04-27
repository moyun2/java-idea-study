package chapter10.com.edu.static_;

public class Visitstatic {
    public static void main(String[] args) {
        System.out.println(A.n);
        A a = new A();
        a.n = 20;
        System.out.println(a.n);
        //由于静态变量是类对象共享，所以一个类改变时，其它对象获取的值也会改变
        System.out.println(A.n);
    }
}

class A {
    public static int n = 10;
}