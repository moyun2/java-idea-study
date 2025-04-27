package chapter10.com.edu.Abstract_;

public class Abstract01 {
    public static void main(String[] args) {
        //B b = new B("tom",18);
        //b.print();
        C c = new C();
        System.out.println("D.a = " + D.a);
        System.out.println("c.a = " + c.a);
        System.out.println("C.a = " + C.a);
    }
}


interface D {
    int a = 10;
}

class C implements D {

}
