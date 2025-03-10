package com.edu.modifier01;

import com.edu.modifier02.C;

//用来测试
public class test {
    public static void main(String[] args) {
        A a = new A();
        a.m();//这是在同一个类中的访问,在同类中，public,protected,默认,private都可以访问到
        B b = new B();
        b.m();//这是在同一个包中的访问,在同包中，public,protected,默认可以访问到,private不可以访问到
        C c = new C();
        c.m();//这是在不同包中的访问,在不同包中，public可以访问到,protected,默认,private不可以访问到
    }
}
