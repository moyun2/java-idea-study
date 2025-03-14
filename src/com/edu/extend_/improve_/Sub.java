package com.edu.extend_.improve_;

public class Sub extends Base {
    public Sub() {
        System.out.println("Sub....");
    }

    public Sub(String name){
        super(name);
        System.out.println("Sub(String name)....");

    }

    public void print() {
        System.out.println("n1=" + n1 + " " + "n2=" + n2 + " " + "n3=" + n3);
        test100();
        test200();
        test300();
        System.out.println("n4=" + getN4());
        calltest400();
    }

}

