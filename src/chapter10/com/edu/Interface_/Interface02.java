package chapter10.com.edu.Interface_;

public class Interface02 {
    public static void main(String[] args) {
        B[] b = new B[2];
        b[0] = new C(1);
        b[1] = new D(2);

        for (int i = 0; i < b.length; i++) {
            b[i].work();
            if(b[i] instanceof C){
                ((C)b[i]).say();
            }
        }
    }
}

interface B {

    void work();
}

class C implements B {
    private int num;
    public C(int num){
        this.num = num;
    }
    @Override
    public void work() {
        System.out.println("C完成接口的重写");
    }

    public void say(){
        System.out.println("C类 独有的方法");
    }
}

class D implements B {
    private int num;
    public D(int num){
        this.num = num;
    }
    @Override
    public void work() {
        System.out.println("D完成接口的实现");
    }
}