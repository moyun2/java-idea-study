package com.edu.poly_.detial;

public class PolyDetial02 {
    public static void main(String[] args) {
        Base base = new Sub();//向上转型
        System.out.println(base.count);//编译类型是Base,输出10
        base.print();
        Sub sub = (Sub) base;//向下转型
        System.out.println(sub.count);//编译类型是Sub,输出20
    }
}

class Base{
    int count = 10;
    public void print(){
        System.out.println(count);
    }
}
class Sub extends Base{
    int count = 20;
    public void print(){
        System.out.println(count);
    }
}