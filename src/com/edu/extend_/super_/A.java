package com.edu.extend_.super_;

public class A extends Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void test100() {
        System.out.println("test100");
    }

    protected void test200() {
        System.out.println("test200");
    }

    void test300() {
        System.out.println("test300");
    }

    private void test400() {
        System.out.println("test400");
    }

    public void info() {
        System.out.println("n1 = " + super.n1 + " n2 = " + super.n2 + " n3 = " + super.n3);
        super.test100();
        super.test200();
        super.test300();
    }

}
