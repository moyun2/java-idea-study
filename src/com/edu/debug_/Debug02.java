package com.edu.debug_;

import java.util.Arrays;

public class Debug02 {
    public static void main(String[] args) {
        //debug数组
        int arr[] = {20,30,89};
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
