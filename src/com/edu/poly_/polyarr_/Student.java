package com.edu.poly_.polyarr_;

public class Student extends Person{
    private double score;
    public Student(String name, int age, double score){
        super(name,age);
        this.score = score;
    }
    public void setScore(double score){
        this.score = score;
    }
    public double getScore(){
        return score;
    }
    public String study(){
        return "学生" + getName() + "年龄" + getAge() +"成绩" + getScore() + "正在学习.....";
    }
}
