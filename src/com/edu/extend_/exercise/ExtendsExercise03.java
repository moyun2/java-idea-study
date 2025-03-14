package com.edu.extend_.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {


    }
}

class Computer {
    private String cpu;
    private int booth;
    private double yingpan;

    public Computer(String cpu, int booth, double yingpan) {
        this.cpu = cpu;
        this.booth = booth;
        this.yingpan = yingpan;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getBooth() {
        return booth;
    }

    public void setBooth(int booth) {
        this.booth = booth;
    }

    public double getYingpan() {
        return yingpan;
    }

    public void setYingpan(double yingpan) {
        this.yingpan = yingpan;
    }

    public void getDeta(){
        System.out.println("cpu = " + cpu + "内存 = " + booth + "硬盘 = " + yingpan);
    }
}
class PC extends Computer {
    private String brand;
    public PC(String cpu, int booth, double yingpan, String brand) {
        super(cpu, booth, yingpan);
        this.brand = brand;
    }


}
class NotePad extends Computer {
    private String color;

    public NotePad(String cpu, int booth, double yingpan, String color) {
        super(cpu, booth, yingpan);
        this.color = color;
    }
}