package com.edu.override_;

public class Dog extends Animal {
    //Dog 继承了 Animal 类，那么Animal里的属性、方法都会有
    //Dog 的 cry 方法与 Animal 的cry 方法定义相同
    //此时就说 Dog 的 cry 方法重写了 Animal 的cry 方法
    public void cry(int b){
        System.out.println("小狗汪汪叫");
    }
    public String m1(){
        return null;
    }
//    //因为Object是String的父类，因此编译不会通过
//    public Object m2(){
//        return null;
//    }
    public void m3(){

    }
}
