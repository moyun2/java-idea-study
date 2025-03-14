package com.edu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("归离","123456",90);
        account.info();
    }
}


class Account{
    private String name;
    private String password;
    private double balance;

    public Account() {
    }

    public Account(String name, String password, double balance) {
        this.setName(name);
        this.setPassword(password);
        this.setBalance(balance);
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 3){
            this.name = name;
        }else{
            System.out.println("输入错误，名字需要在2-3个字符之间");
            this.name = "无名";
        }
    }

    public String getName(){
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6){
            this.password = password;
        }else{
            System.out.println("输入错误，密码必须为6位，默认密码为000000");
            this.password = "000000";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20){
            this.balance = balance;
        }else{
            System.out.println("重新输入");
            this.balance = 0;
        }

    }

    public void info(){
        System.out.println("姓名=" + this.getName() + "密码=" + this.getPassword() + "薪水=" + this.getBalance());
    }
}
