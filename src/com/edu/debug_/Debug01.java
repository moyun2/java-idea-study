package com.edu.debug_;

public class Debug01 {
    public static void main(String[] args) {
        //案例1，查看变量的变化
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum += i;
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
        }
        System.out.println("end.....");
    }
}
