package com.edu.object_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person_ p1 = new Person_();
        p1.name = "moyun";

        Person_ p2 = new Person_();
        p2.name = "moyun";
        System.out.println(p1 == p2);//这里判断的是是否为同一个对象 F
        System.out.println(p1.name.equals(p2.name));//这里调用的是字符串的重写equals方法 T
        System.out.println(p1.equals(p2));//这里调用的是Object的equals方法，判断的是是否为同一个对象 F
        String s1 = new String("abcd");
        String s2 = new String("abcd");
        System.out.println(s1.equals(s2));//仍调用的是字符串的方法 T
        System.out.println(s1 == s2); //判断的是是否为同一个对象 F
    }
}

class Person_ {
    public String name;
}
