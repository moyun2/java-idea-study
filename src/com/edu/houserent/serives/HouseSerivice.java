package com.edu.houserent.serives;

import com.edu.houserent.domain.House;

public class HouseSerivice {

    private House[] houses;
    private int houseNums = 1;//用来记录当前有多少个房屋信息
    private int Counter = 1;//记录id
    private House[] houses1;
    public HouseSerivice(int size) {
        //new houses
        houses = new House[size];//创建对象时,指定数组大小
        houses[0] = new House(1,"tom","111","火星区",20,"未出租");
    }

    public House[] list() {
        return houses;
    }

    //find方法
    public House findHouse(int findid) {
        for (int i = 0; i < houses.length; i++){
            if(findid == houses[i].getId()){
                return houses[i];
            }
        }

        return null;
    }


    //del方法，删除房屋对象
    public boolean del(int delid){
        //首先要找到删除房屋的对应下标
        int index = -1;
        for(int i = 0; i < houseNums; i++){
            if(delid == houses[i].getId()){//删除房屋的id
                index= i;//使用index记录下标
            }
        }

        if(index == -1){
            return false;
        }

        for(int i = index; i < houseNums-1; i++){
            houses1[i] = houses[i+1];
        }
        houses[--houseNums] = null;
        return true;
    }

    //add方法,添加新对象，返回boolean
    public boolean add(House newhouse){
        //判断是否还可以继续添加
        if(houseNums == houses.length){
            houses1 = new House[houses.length+1];
            for(int i=0; i < houses.length; i++){
                houses1[i] = houses[i];
            }

        }

        //把newhouse对象存入数组，表示新加的房屋
        houses1[houseNums++] = newhouse;
        //设计一个id自增长的机制，然后更新newhouse的id
        newhouse.setId(++Counter);
        return true;
    }

    //更新数组的引用
    public void note() {
        houses = houses1;
    }

}
