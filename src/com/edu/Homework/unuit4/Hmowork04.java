package com.edu.Homework.unuit4;

public class Hmowork04 {
    public static void main(String[] args) {
        Employee employee = new Employee("tom", 3000,10);
        employee.print();
        Manger manger = new Manger("cat", 5000, 30);
        Emoplye emoplye = new Emoplye("小明", 1000, 90);
        manger.print();
        emoplye.print();
    }
}

//父类：员工类
class Employee{
    private String name;
    private double sal;//单日工资
    private int days;//工作天数

    public Employee(String name, double sal, int days) {
        this.name = name;
        this.sal = sal;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double sal(){
        return getSal() * getDays();
    }

    //打印工资
    public void print(){
        System.out.println("姓名=" + getName() + "\t" + "工资=" + sal());
    }
}

//部门经理类
class Manger extends Employee{
    public Manger(String name, double sal, int days){
        super(name, sal, days);
    }

    public double sal(){
        return 1000+super.sal()*1.2;
    }

    //打印工资
    public void print(){
        System.out.println("经理：姓名=" + getName() + "\t" + "工资=" + sal());
    }
}

//普通员工类
class Emoplye extends Employee{
    public Emoplye(String name, double sal, int days) {
        super(name, sal, days);
    }

    @Override
    public double sal() {
        return super.sal()*1.0;
    }


    public void print() {
        System.out.println("普通员工：姓名=" + super.getName() + "\t" + "工资=" + sal());

    }
}