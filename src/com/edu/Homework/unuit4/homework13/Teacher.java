package com.edu.Homework.unuit4.homework13;

public class Teacher extends Person{

    //属性
    private double work_age;//工龄

    public Teacher(String name, char sex, int age, double work_age) {
        super(name,sex,age);
        this.work_age = work_age;
    }


    public double getWork_age() {
        return work_age;
    }

    public void setWork_age(double work_age) {
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("我承诺，我会好好教课");
    }

    public String paly() {
        return getName() + super.paly() + "象棋";
    }

    public void Info() {
        System.out.println("老师的信息：");
        super.Info();
        System.out.println(paly());
    }
}
