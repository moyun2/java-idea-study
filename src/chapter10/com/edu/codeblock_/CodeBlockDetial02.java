package chapter10.com.edu.codeblock_;

public class CodeBlockDetial02 {
    public static void main(String[] args) {
        new BBB();
    }
}

class AAA {

    public AAA(){
        System.out.println("AAA 的无参构造");
    }

    {
        System.out.println("AAA 的非静态代码块");
    }
    static {
        System.out.println("AAA 的静态代码块");
    }
}


class BBB extends AAA{
    //public int a = 10;
    public BBB(){
        super();
        System.out.println("BBB 的无参构造");
    }
    static {
        System.out.println("BBB 的静态代码块");
    }


    {
        System.out.println("BBB 的非静态代码块");
    }
}
