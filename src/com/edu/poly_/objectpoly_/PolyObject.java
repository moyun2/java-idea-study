package com.edu.poly_.objectpoly_;

public class PolyObject {
    public static void main(String args[]){
        //体验对象多态特点

        //编译类型是Animal 运行类型是Dog
        Animal animal = new Dog();
        //运行时发现运行的类型是DOg,所以这时候的cry是Dog类的cry
        animal.cry();

        //编译类型不会改变，但是此时运行类型从Dog变到了Cat
        animal = new Cat();

        //此时会输出Cat的cry
        animal.cry();
    }
}
