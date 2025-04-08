package com.edu.Homework.unuit4.homework09;

public class homework09 {
    public static void main(String[] args) {
        Person p1 = new Student();
        p1.run();
        p1.eat();
        Student p = (Student) p1;
        p.study();
        p.run();
    }
}

class Person {
    public void run () {
        System.out.println("Person sun");
    }
    public void eat () {
        System.out.println("Person eat");
    }
}

class Student extends Person {
    public void run () {
        System.out.println("Student sun");
    }
    public void study () {
        System.out.println("Student study");
    }
}