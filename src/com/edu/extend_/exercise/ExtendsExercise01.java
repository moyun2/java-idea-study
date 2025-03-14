package com.edu.extend_.exercise;

public class ExtendsExercise01 {
    public static void main(String args[]){
        B b = new B();
    }
}

class A {
    A(){
        System.out.println("a");
    }
    A(String name){
        System.out.println("a name");
    }
}
class B extends A {
    B(){
        this("abc");
        System.out.println("b");
    }
    B(String name){
        //这里有个默认的super(),会调用父类的无参构造器
        System.out.println("b name");
    }
}