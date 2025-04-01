package com.edu.houserent.view;
import com.edu.houserent.domain.House;
import com.edu.houserent.serives.HouseSerivice;
import com.edu.houserent.utils.*;
/**
 * 这个类用来显示主界面
 */

public class HouseView {
    private boolean loop = true;//用来控制菜单
    private char key=' ';//用来接受用户的输入
    private HouseSerivice houseSerivice = new HouseSerivice(1);

    //编写delHouse() 接受输入的id,来查找确认房屋，调用del方法删除
    public void delHouse() {
        System.out.println("=======删除房屋=======");
        System.out.println("请输入你要删除房屋的编号(-1退出)：");
        int delid = Utility.readInt();
        if(delid == -1){
            System.out.println("放弃删除房屋");
            return;
        }
        //注意该方法本身就有循环判断的逻辑，必须二次确定
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y'){
            if(houseSerivice.del(delid)){
                System.out.println("删除成功");
            }else{
                System.out.println("编号不存在");
            }
        }else{
            System.out.println("放弃删除");
        }

    }

    //findhouse()用来查找房屋
    public void findHouse(){
        System.out.println("=====查找房屋======");
        System.out.print("请输入你要查找的房屋id：");
        int findid = Utility.readInt();
        //调用findid
        House house = houseSerivice.findHouse(findid);
        if(house != null){
            System.out.println(house);
        }else{
            System.out.println("房屋不存在");
        }
    }

    //update()用来修改房屋
    public void update(){
        System.out.println("=====修改房屋======");
        System.out.print("请输入你要修改的房屋的id(-1退出)：");
        int updateid = Utility.readInt();
        if(updateid == -1) {
            System.out.println("成功放弃修改");
        }
        //根据updete去查找房屋
        House house = houseSerivice.findHouse(updateid);
        if(house == null){
            System.out.println("房屋不存在");
            return;
        }

        System.out.println("姓名(" + house.getName() + "): ");
        String name = Utility.readString(8,"");
        if(!"".equals(name)){
            house.setName(name);
        }
        System.out.println("电话(" + house.getPhone() + "): ");
        String phone = Utility.readString(11);
        if(!"".equals(phone)){
            house.setPhone(phone);
        }
        System.out.println("地址(" + house.getAddress() + "): ");
        String address = Utility.readString(16);
        if(!"".equals(address)){
            house.setAddress(address);
        }
        System.out.println("月租(" + house.getRent() + "): ");
        int rent = Utility.readInt(-1);
        if(rent != -1){
            house.setRent(rent);
        }
        System.out.println("状态(" + house.getState() + "): ");
        String state = Utility.readString(3);
        if(!"".equals(state)){
            house.setState(state);
        }
    }

    //显示房屋列表
    public void ListHouses() {
        System.out.println("===========房屋列表==========");
        System.out.println("编号 房主 电话 地址 月租 状态(未出售/已出售)");
        House[] houses = houseSerivice.list();
        for(int i=0; i < houses.length; i++) {
            System.out.println(houses[i].toString());
        }
    }

    //addHouses(),接受输入，创建对象，调用add方法
    public void addHouse() {
        System.out.println("====添加房屋====");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(11);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);
        //创建一个新的House对象,注意id 是由系统分配的,用户不能输入
        House newhouse = new House(0,name,phone,address,rent,state);
        if(houseSerivice.add(newhouse)){
            System.out.println("房屋添加成功");
            houseSerivice.note();
        }else{
            System.out.println("房屋添加失败");
        }
    }

    public void exit() {
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y'){
            loop = false;
        }

    }

    public void MeanView() {
        do{
            //主菜单
            System.out.println("========房屋出租管理系统========");
            System.out.println("\t\t1 新 增 房 源");
            System.out.println("\t\t2 查 找 房 屋");
            System.out.println("\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t5 房 屋 列 表");
            System.out.println("\t\t6 退 出");

            System.out.print("请输入你的选择(1-6):");

            //用户的选择
            key = Utility.readChar();
            switch (key) {
                case '1':
                    System.out.println("新 增 房 源");
                    addHouse();
                    break;
                case '2':
                    System.out.println("查 找 房 屋");
                    findHouse();
                    break;
                case '3':
                    System.out.println("删 除 房 屋 信 息");
                    delHouse();
                    break;
                case '4':
                    System.out.println("修 改 房 屋 信 息");
                    update();
                    break;
                case '5':
                    System.out.println("房 屋 列 表");
                    ListHouses();
                    break;
                case '6':
                    System.out.println("退 出");
                    exit();
                    break;
                default:
                    System.out.println("错误输入");
                    break;

            }

        }while(loop);
    }
}
