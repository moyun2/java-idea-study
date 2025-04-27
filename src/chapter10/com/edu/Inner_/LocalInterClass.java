package chapter10.com.edu.Inner_;

public class LocalInterClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.say();
    }
}


class Outer{
    private int n1 = 100;
    private static String name = "tom";
    public void say(){
        int n3 = 30;
        int n1 = 40;
        class inner {
            public void ptint(){
                System.out.println("n3 = " + n3);
                System.out.println("n1 = " + n1);
                System.out.println("外部n1 = " + Outer.this.n1);
            }
        }
        inner inner = new inner();
        inner.ptint();
    }
}
