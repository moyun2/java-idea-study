package com.edu.poly_.detial;

public class PolyDetial03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        //aa 编译类型是 AA ,运行类型是BB
        AA aa = new BB();
        System.out.println(aa instanceof BB);//如果instanceof 看的是编译类型，那么这里的结果就是false，但是结果是true,所以看的是运行类型
        System.out.println(aa instanceof AA);

        Object obj = new Object();
        System.out.println(obj instanceof AA);
    }
}
class AA{}
class BB extends AA{}
