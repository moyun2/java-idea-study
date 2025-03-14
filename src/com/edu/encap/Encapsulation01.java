package com.edu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("归离");
        System.out.println(person.getName());
        person.setAge(18);
        Person p1 = new Person("魔云", 21,99999);
    }
}


class Person{
    public String name;
    private int age;
    private double salary;
    private String job;

    public Person(){

    }
    //定义三个属性的构造器
    public Person(String name, int age, double salary) {
        //this.salary = salary;
        //this.age = age;
        //this.name = name;
        //但是没有了保护机制，所以传入方法
        setAge(age);
        setSalary(salary);
        setName(name);
    }

    public void setName(String name){
        if(name.length() >= 2 && name.length() <= 6){
            this.name = name;
        }else{
            System.out.println("你的输入有问题，名字需要在2-6个字符之间");
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age >= 1 && age <= 120){
            this.age = age;
        }else{
            System.out.println("你的输入有问题，年龄需要在1-120岁之间");
        }
    }

    public void setSalary(double salary) {
        //增加一个权限的判断
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
