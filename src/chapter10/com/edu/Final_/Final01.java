package chapter10.com.edu.Final_;

public class Final01 {
    public static void main(String[] args) {
        final int num1 = 100;
        new A();
    }
}


//当不希望类被继承时，可以使用final修饰
//final class A {}
class A {

    final static int NUM2 = 56;
    public A(){
         int num = 45;
        System.out.println(num);
    }
}

class B extends A{}