package com.edu.Homework.unuit4.homework13;

public class homework13 {
    public static void main(String args[]) {

        Person[] p = new Person[4];
        p[0] = new Student("小明", '男', 18, 001);
        p[1] = new Student("小红", '女', 20, 002);
        p[2] = new Teacher("诸葛亮", '男', 90, 13.4);
        p[3] = new Teacher("小白", '女', 34, 1.4);

        //创建对象来调用
        homework13 h = new homework13();
        h.bubbleSort(p);

    }

    public void bubbleSort(Person[] p) {
        Person temp = null;
        for(int i = 0; i < p.length - 1; i++){
            for(int j = 0; j < p.length - 1 - i; j++) {
                if(p[j].getAge() < p[j+1].getAge()){
                    temp = p[j+1];
                    p[j+1] = p[j];
                    p[j] = temp;
                }
            }
        }
        for(int i = 0; i < p.length; i++){
            p[i].Info();
            p[i].key(p[i]);
        }
    }
}
