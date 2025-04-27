package chapter10.com.edu.Inner_;

import java.security.CryptoPrimitive;

public class AnnoyinnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04{
    private int n1 = 10;
    public void method(){
        IA ia = new IA(){
            @Override
            public void cry() {
                System.out.println("匿名类的书写");
            }
        };
        ia.cry();
        System.out.println("ia的运行类型 = " + ia.getClass());

        //基于类的匿名内部类
        Father father = new Father(3){
            
        };
    }
}


interface IA {
    public void cry();
}


class Father {
    private int num;
    public Father(int num){
        this.num = num;
    }
}