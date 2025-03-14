package com.edu.extend_.exercise;


public class ExtendsExercise02 {
    public static void main(String[] args) {
        c c1 = new c();
        // 输出a类，b的有参构造，c的有参构造，c的无参构造
    }
}
class a {
    public a(){
        System.out.println("我是a类");
    }
}
class b extends a {
    public b(){
        System.out.println("b的无参构造");
    }
    public b(String name){
        System.out.println("b的有参构造");
    }
}
class c extends b {
    public c(){
        this("hellow");
        System.out.println("c的无参构造");
    }
    public c(String name){
        super("hahaha");
        System.out.println("c的有参构造");
    }
}