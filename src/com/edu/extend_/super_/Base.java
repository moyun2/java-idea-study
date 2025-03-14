package com.edu.extend_.super_;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void test100(){
        System.out.println("basetest100");
    }
    protected void test200(){
        System.out.println("baseetest200");
    }
    void test300(){
        System.out.println("basetest300");
    }
    private void test400(){
        System.out.println("basetest400");
    }
}
