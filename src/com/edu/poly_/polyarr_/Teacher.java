package com.edu.poly_.polyarr_;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void setSalary() {
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public String teach(){
        return "老师" + getName() + "年龄" + getAge() +"工资" + getSalary() + "正在上课....";
    }
}
