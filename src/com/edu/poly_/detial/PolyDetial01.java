package com.edu.poly_.detial;

public class PolyDetial01 {
    public static void main(String[] args) {
        //向上转型：父类的引用指向了子类对象
        //语法：父类类型引用名 = new 子类对象();
        Animal animal = new Cat();
        Object object = new Cat();//也可以

        // 可以调用父类中的所有成员(需要遵循访问权限)，
        //不能调用子类中的特有成员。
        //animal.eatchMouse();

        //最终的运行效果看子类的具体实现！
        //调用一样是从子类开始查找
        animal.eat();//猫吃鱼
        animal.run();//跑
        animal.sleep();//睡觉
        animal.show();//展示

        //向上转型不能调用子类的特有方法，因此需要向下转型
        //（1）语法：子类类型 引用名 = (子类类型) 父类引用名
        //cat的编译类型是Cat ,运行类型是Cat，这里并不会改变上面的animal的编译类型，以及运行类型，这两个是独立的

        Cat cat = (Cat) animal;
        cat.catchMouse();//猫抓老鼠
        //(2)要求父类的引用必须指向的是当前目标类型的对象
        //Dog dog = (Dog) animal;//在这里实际上编译是通过的，但是运行会错误
    }
}
