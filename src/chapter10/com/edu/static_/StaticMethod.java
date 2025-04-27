package chapter10.com.edu.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Student jack = new Student("jack", 13);
        Student.income(100);
        Student tom = new Student("tom", 13);
        Student.income(29.5);
        Student cat= new Student("cat", 13);
        Student.income(34);
        System.out.println("学生一共交了" + Student.fee + "元");
    }
}


class Student {
    private String name;
    private int age;
    public static double fee;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void income(double fees) {
        Student.fee += fees;
    }


}
