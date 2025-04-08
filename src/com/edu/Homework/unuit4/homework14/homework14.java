package com.edu.Homework.unuit4.homework14;

public class homework14 {
    public static void main(String[] args) {
        C c =  new C();
    }
}


class A {
    public A(){
        System.out.println("我是A类");
    }
}

class B extends A {
    public B() {
        System.out.println("我是B类的无参构造");
    }
}

class C extends B {
    public C(){
        System.out.println("我是C类的无参构造");
    }
}
