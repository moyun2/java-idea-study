package com.edu.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();//向上转型
        System.out.println(a.i);//这是在调属性，属性看编译类型
        System.out.println(a.sum());//调方法看运行类型---40。如果我把B类的sum()方法注释掉，它会去父类进行查找sum方法，也就会执行return getI() + 10;，但是父类与子类都有getI方法，但是由于动态绑定机制，一样会去运行类型找，找不到，才回父类找
        System.out.println(a.sum1());//----30
        System.out.println(a.getI());//----20,虽然A，B里面都有i这个属性，但是这里的本质是调用方法，就要看方法中参数的作用域
        //只有单独调属性才看编译类型

    }
}


class A {//父类
    public int i = 10;
    public int sum(){
        return getI() + 10;
    }
    public int sum1(){
        return i + 10;
    }
    public int getI(){
        return i;
    }
}
class B extends A {
    public int i = 20;

//    @Override
//    public int sum() {
//        return i + 20;
//    }


//    public int getI() {
//        return i;
//    }

    @Override
    public int sum1() {
        return i + 10;
    }
}