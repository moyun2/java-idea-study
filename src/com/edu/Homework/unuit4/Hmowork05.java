package com.edu.Homework.unuit4;

public class Hmowork05 {
    public static void main(String[] args) {

    }
}

//父类员工类
class Empolyee {
    private double sal;//日薪
    private int days;

    public Empolyee(double sal, int days) {
        this.sal = sal;
        this.days = days;
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

    public double calsal() {
        return getSal()*getDays();
    }

}