package com.edu.extend_.super_;

public class B extends A{

    //这里调用的是父类的成员属性和方法
    public void info(){
        System.out.println(super.n1+super.n2+super.n3);
        super.test100();
        super.test200();
        super.test300();
    }

    public void info2(){
        super.info();
    }


}
