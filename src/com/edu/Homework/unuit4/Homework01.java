package com.edu.Homework.unuit4;

public class Homework01 {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0] = new Person("jack", 10, "教师");
        p[1] = new Person("bob", 20, "叫兽");
        p[2] = new Person("cat", 30, "校长");
        for(int i = 0; i < p.length; i++){
            System.out.println(p[i].toString());
        }
        System.out.println("排序后的========");
        Person temp = null;
        for(int i = 0; i < p.length - 1; i++){
            for (int j = 0; j < p.length - 1 - i; j++) {
                if(p[j].getAge() < p[j+1].getAge()){
                    temp = p[j];
                    p[j] = p[j+1];
                    p[j + 1] = temp;
                }
            }

        }

        for(int i = 0; i < p.length; i++){
            System.out.println(p[i].toString());
        }
    }
}



class Person {
    private String name;
    private int age;
    private String job;
    public Person(String name, int age, String job){
        this.name = name;
        this.age = age;
        this.job = job;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}