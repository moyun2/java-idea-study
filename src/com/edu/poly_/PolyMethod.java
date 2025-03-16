package com.edu.poly_;

public class PolyMethod {
    public static void main(String[] args) {
        //方法重载体现多态
        A a = new A();
        //这里传入不同的参数，就会调用不同的sum方法,就体现多态
        System.out.println(a.sum(10, 20));
        System.out.println(a.sum(10, 20, 30));

        //方法重写体现多态
        B b = new B();
        b.say();
        a.say();
    }
}

class B {//父类

    public void say() {
        System.out.println("B say() 方法被调用");
    }
}

class A extends B {//子类

    public int sum(int n1, int n2) {//和下面的sum构成重载
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public void say() {
        System.out.println("A say() 被调用");
    }
}