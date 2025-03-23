package com.edu.poly_.polyparameter_;

public class Woker extends Employee{
    public Woker(String name, double salary){
        super(name, salary);
    }
    public String work(){
        return getName() + "\t" + getSalary() + "正在工作...";
    }
    public double getAnnual(){
        return getSalary();
    }

}
