package com.edu.extend_.detial;

public class Extengds01 {
    public static void main(String[] args) {
        Pupil p1 = new Pupil();
        p1.name = "jack";
        p1.age = 12;
        p1.setScore(100);
        p1.testing();
        p1.showInfo();
        Graduate graduate = new Graduate();
        graduate.name = "tom";
        graduate.age = 21;
        graduate.setScore(60);
        graduate.testing();
        graduate.showInfo();
    }
}
