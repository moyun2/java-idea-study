package com.edu.poly_.polyarr_;

import java.sql.SQLOutput;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("锐锐", 18);
        persons[1] = new Student("李白", 45,100);//向上转型
        persons[2] = new Student("赵云", 90,20);//向上转型
        persons[3] = new Teacher("诸葛亮", 60,30000);//向上转型
        persons[4] = new Teacher("刘备", 23,100);//向上转型
        //persons[i]编译类型是Person,运行类型看实际
        for (int i = 0; i < persons.length; i++) {
            if(persons[i] instanceof Student){
                System.out.println(persons[i].say());
                System.out.println(((Student)persons[i]).study());//study是子类特有方法，需要向下转型
            }else if(persons[i] instanceof Teacher){
                System.out.println(persons[i].say());
                System.out.println(((Teacher)persons[i]).teach());//teach是子类特有方法，需要向下转型
            }else if(persons[i] instanceof Person){
                System.out.println(persons[i].say());
            }else{
                System.out.println("类型错误");
            }

        }
    }
}
