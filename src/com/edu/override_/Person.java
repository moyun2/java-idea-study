package com.edu.override_;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(){
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String say(){
        return "姓名=" + name + "\t" + "年龄=" +age;
    }
}
