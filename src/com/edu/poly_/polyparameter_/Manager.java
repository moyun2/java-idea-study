package com.edu.poly_.polyparameter_;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary, double bonus ){
        super(name,salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + 30000;
    }
}
