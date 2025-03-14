package com.edu.override_;

public class Student extends Person{
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say(){
        return super.say() + "\t" +  "id= " + this.id +"\t" + "成绩=" + this.score;
    }

}
