package com.edu.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("锐锐", 18);
        String str1 =  person.say();
        System.out.println(str1);
        Student student = new Student("小明",21,001,100.00);
        String str2 = student.say();
        System.out.println(str2);
    }
}
