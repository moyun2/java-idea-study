package com.edu.extend_.detial;
//小学生，模拟小学生考试
public class Pupil {
    public String name;//名字
    public int age;//年龄
    private double score;//成绩

    public void setScore(double score) {
        this.score = score;
    }

    public void testing(){
        System.out.println("小学生"+ name + "正在考试");
    }
    public void showInfo(){
        System.out.println("学生名" + name + "年龄" + age + "成绩" + score);
    }
}
