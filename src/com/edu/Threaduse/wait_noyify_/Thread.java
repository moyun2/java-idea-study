package com.edu.Threaduse.wait_noyify_;

public class Thread {
    public static void main(String[] args) {
        new Cook().start();
        new Foodie().start();
    }
}
