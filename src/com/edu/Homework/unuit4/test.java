package com.edu.Homework.unuit4;

public class test {
    public static void main(String[] args) {
        int[] arr = {3,6,56,9,90,43};
        int temp = 0;//临时变量
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j <arr.length -1 -i; j++){
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                for(int k = 0; k < arr.length; k++){

                    System.out.print(arr[k] + "\t");

                }
                System.out.println();
            }


        }

    }
}
