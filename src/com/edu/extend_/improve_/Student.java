package com.edu.extend_.improve_;

public class Student {
    public String name;//名字
    public int age;//年龄
    private double score;//成绩

    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo(){
        System.out.println("学生名" + name + "年龄" + age + "成绩" + score);
    }
}
