package chapter10.com.edu.Final_;

public class FinaExercise01 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        System.out.println(circle1.getArea());
    }
}

class Circle {
    private double radius;
    private final double PI = 3.14;//定义时赋值
    private final double PI2;
    private final double PI3;
    {
        PI3 = 15;//代码块赋值
    }

    public  Circle(double radius){
        this.radius = radius;
        PI2 = 23;//构造器赋值
    }

    public double getArea() {
        return PI*radius*radius;
    }
}
