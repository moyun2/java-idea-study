package com.edu.Homework.unuit4.homework13;

//
public class Student extends Person{

    //属性
    private double stu_id;//学号

    //构造器
    public Student(String name, char sex, int age, double stu_id) {
        super(name,sex,age);
        this.stu_id = stu_id;
    }


    public double getStu_id() {
        return stu_id;
    }

    public void setStu_id(double stu_id) {
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public String paly() {
        return getName() + super.paly() + "足球";
    }

    public void Info() {
        System.out.println("学生的信息：");
        super.Info();
    }
}


