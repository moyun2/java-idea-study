package com.edu.modifier02;

//引入不同包的A类
import com.edu.modifier01.A;
import com.edu.modifier01.B;

public class C {
    A a = new A();//这是在不同包的
    public void m(){
        System.out.println("n1=" + a.n1);//在不同包的情况下，只有public可以访问
    }
    B b = new B();
}
