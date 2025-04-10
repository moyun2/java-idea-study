package com.edu.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack",18,'0');
        Person person2 = new Person("moyun",89,'1');
        Person person3 = new Person("jack",18,'0');
        Person p3 = person1;
        System.out.println(p3.equals(person1));
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }
}



class Person {
    private String name;
    private int age;
    private char gender;

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
           Person p = (Person)obj;
           if(this.name.equals(p.name) && this.age == p.age && this.gender == p.gender){
               return true;
           }
        }


        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
