package com.edu.Homework.unuit4.homework08;

import com.edu.poly_.polyarr_.Person;

public class homework08 {
    public static void main(String[] args) {
        Doctor doctor1 =  new Doctor("jack", 10,"医生",'男', 2000);
        Doctor doctor2 =  new Doctor("jack", 2,"医生",'男', 2000);
        System.out.println(doctor1.equals(doctor2));
    }
}

class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj instanceof Person){
            Person p = (Person)obj;
            if(this.name.equals(p.getName()) && this.age == p.getAge()){
                return true;
            }
        }
        return false;

    }
}
