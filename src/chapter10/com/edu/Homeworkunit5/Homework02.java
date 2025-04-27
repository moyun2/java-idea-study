package chapter10.com.edu.Homeworkunit5;

public class Homework02 {
    public static void main(String[] args) {
        Frock frock = new Frock();
        frock.toString();
        System.out.println(frock.toString());
    }
}


class Frock {
    private static int currentNum = 100000;//衣服出厂的序列号初始值
    private int serialNumber = 0;
    public Frock() {
        serialNumber = getSerialNumber();
    }


    public static int getSerialNumber() {
        return currentNum + 100;
    }

    @Override
    public String toString() {
        return "Frock{" +
                "serialNumber=" + getSerialNumber() +
                '}';
    }
}
