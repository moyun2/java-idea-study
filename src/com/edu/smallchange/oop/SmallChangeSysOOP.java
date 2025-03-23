package com.edu.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能的类
 * 使用OOP(面向对象编程
 * 将各个功能对于一个方法
 */

public class SmallChangeSysOOP {
    //属性
    boolean loop = true;//用来判断do-while循环是否继续，看是否退出零钱通
    Scanner scanner = new Scanner(System.in);
    //用字符串来接收用户的输入
    String key = "";

    String shop = "";

    //新的关于钱的变量
    double money = 0;//钱的收入、支出
    double balance = 0;//现在的资金

    String detials = "======零钱通明细=====";

    Date date = null;//日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期的格式化

    //1. 菜单
    public void meanShow() {
        do {
            System.out.println("\n=======零钱通菜单======");
            System.out.println("1.零钱通明细");
            System.out.println("2.收益入账");
            System.out.println("3.消费");
            System.out.println("4.退出");
            System.out.println("======================");
            System.out.print("请选择(1-4)：");
            key = scanner.next();
            switch(key){
                case "1":
                    shoumoney();
                    break;
                case "2":
                    Income();
                    break;
                case "3":
                   Pay();
                    break;
                case "4":
                    extis();
                    break;
                default:
                    System.out.println("你输入的不正确");
                    break;

            }
        } while (loop);
        System.out.println("你已经成功退出零钱通了....");
    }
    //2. 零钱通明细
    public void shoumoney() {
        System.out.println(detials);
    }

    //3. 收益明细
    public void Income() {
        System.out.println("=========收益入账=====");
        System.out.print("请输入收益金额：");
        money = scanner.nextDouble();
        //找出不正确的金额条件，然后直接给出提示，就直接Break，优先写不利条件，这个很重要
        if(money <= 0){
            System.out.println("金额输入不正确，范围应大于0");
            return;//退出到菜单
        }
//                    do{
//                        System.out.print("请输入收益金额：");
//                        money = scanner.nextDouble();
//                        if(money <= 0){
//                            System.out.println("金额输入不正确，范围应大于0");
//                        }
//                    }while(money <= 0);
        balance += money;//现在的资金
        date = new Date();//获取当前的日期
        detials += "\n收益入账\t+" + money + "\t日期\t" + sdf.format(date) + "\t余额\t" + balance;
    }

    //4 消费明细
    public void Pay() {
        System.out.print("请输入你的消费：");
        money = scanner.nextDouble();
        if(money <= 0 || money > balance){
            System.out.println("你的消费金额应该在0-" + balance);
            return;
        }
        balance += money;
        date = new Date();//获取当前的日期
        System.out.print("消费说明：");
        shop = scanner.next();//具体的消费
        detials += "\n" + shop + "\t-" + money + "\t日期\t" + sdf.format(date) + "\t余额\t" + balance;
    }

    //5. 退出系统
    public void extis() {
        String choice = "";

        while(true){
            System.out.println("你确定要退出嘛？(请输入y确定,n否定)");
            System.out.print("请输入：");
            choice = scanner.next();
            if("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if("y".equals(choice)){
            loop = false;
        }
    }
}
