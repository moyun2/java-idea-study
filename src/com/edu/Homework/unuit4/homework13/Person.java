package com.edu.Homework.unuit4.homework13;

//父类
public class Person {
    //属性
    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String paly() {

        return "爱玩";
    }

    public void Info() {

        System.out.println("姓名：" + getName() + "\n"+"年龄："  + getAge()  + "\n" + "性别：" + getSex());
    }

    public void key(Person p){
        if(p instanceof Student){
            Student s = (Student) p;
            s.study();
        }

        if(p instanceof Teacher){
            Teacher t = (Teacher) p;
            t.teach();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
