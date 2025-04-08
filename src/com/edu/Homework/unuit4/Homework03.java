package com.edu.Homework.unuit4;

public class Homework03 {
    public static void main(String args[]){
        Teacher teacher = new Teacher("tom", 21,"教师",90000);
        Professor professor = new Professor("cat", 43, "教授", 100000);
        fuProfessor fuProfessor = new fuProfessor("小明", 30, "副教授", 50000);
        jiangshi jiangshi = new jiangshi("小红", 45 , "讲师", 40000);
        teacher.introduce();
        professor.introduce();
        fuProfessor.introduce();
        jiangshi.introduce();
    }
}

class jiangshi extends Teacher{
    public jiangshi(String name, int age, String post, double sal) {
        super(name, age, post, sal);
    }

    public double getSal(){
        return super.getSal()*1.1;
    }
    public void introduce(){
        System.out.println("讲师的信息:姓名=" + super.getName() + "\t" + "年龄=" + super.getAge() + "\t" + "职称=" + super.getPost() + "\t" + "基本工资=" + getSal());
    }
}


class Teacher {
    private String name;//姓名
    private int age;//年龄
    private String post;//职称
    private double sal;//基本工资

    public Teacher(String name, int age, String post, double sal){
        this.name = name;
        this.age =age;
        this.post = post;
        this.sal = sal;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public void introduce(){
        System.out.println("教师的信息:姓名=" + getName() + "\t" + "年龄=" + getAge() + "\t" + "职称=" + getPost() + "\t" + "基本工资=" + getSal());
    }
}


class Professor extends Teacher{

    public Professor(String name, int age, String post, double sal) {
        super(name, age, post, sal);
    }

    public double getSal(){
        return super.getSal()*1.3;
    }
    public void introduce(){
        System.out.println("正教授的信息:姓名=" + super.getName() + "\t" + "年龄=" + super.getAge() + "\t" + "职称=" + super.getPost() + "\t" + "基本工资=" + getSal());
    }
}

class fuProfessor extends Teacher{
    public fuProfessor(String name, int age, String post, double sal){
        super(name, age, post, sal);
    }
    public double getSal(){
        return super.getSal()*1.2;
    }
    public void introduce(){
        System.out.println("副教授的信息:姓名=" + super.getName() + "\t" + "年龄=" + super.getAge() + "\t" + "职称=" + super.getPost() + "\t" + "基本工资=" + getSal());
    }
}
