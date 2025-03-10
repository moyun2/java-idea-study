package com.edu.modifier01;

//这是用来学习访问修饰符的
public class A {

    //分别定义四个属性，用不同的修饰符控制权限
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 =400;

    //定义一个方法来查看属性的范围
    public void m(){
        System.out.println("n1 = " + n1 + "\t"+ "n2 = " + n2 +"\t"+ "n3 = " + n3+"\t" + "n4 = " + n4);
    }

}

class b{}


