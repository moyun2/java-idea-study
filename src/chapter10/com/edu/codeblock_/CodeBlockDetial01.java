package chapter10.com.edu.codeblock_;

public class CodeBlockDetial01 {
    public static void main(String[] args) {
        new CodeBlockDetial01();
    }

    static {
        System.out.println("我是静态代码块");
    }

    {
        System.out.println("我是非静态代码块");
    }
}
