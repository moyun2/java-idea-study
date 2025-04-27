package chapter10.com.edu.Enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
            //演示 Enum 类的各种方法
//        Season2 summer = Season2.SUMMER;
//        // 输出枚举对象的名字
//        System.out.println(summer.name());
//        //ordinal() 输出的是该枚举对象的次序/编号，从0开始编号
//        //summer是第二个
//        System.out.println(summer.ordinal());
//        //value() 返回的是 Season2[]
//        //含有定义的所有枚举对象
//        Season2[] value = Season2.values();
//        for (Season2 season2:value){//增强的for循环 //执行的流程时，依次从value中拿出一个值赋给season2，如果取出完毕，则退出循环
//            System.out.println(season2);
    }
}


//演示自定义枚举
class Season {
    private String name;//季节名称
    private String description;//季节描述
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    //1.构造器私有化，目的防止 直接 new
    //2.去掉setXxx方法，方式属性被修改
    //3，在Season 内部 直接创建固定的对象
    private Season(String name,String description){
        this.name = name;
        this.description = description;
    }
    public final static Season SPRING = new Season("春天","温暖");
    public final static Season SUMMER = new Season("夏天","炎热");
    public final static Season AUTUMN = new Season("秋天","凉爽");
    public final static Season WINTER = new Season("冬天","寒冷");
}

//enum Season2 {
//
//    SPRING("春天", "温暖"), SUMMER("夏天", "炎热"),
//    AUTUMN("秋天", "凉爽"), WINTER("冬天", "寒冷");
//    private String name;//季节名称
//    private String description;//季节描述
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    //1.构造器私有化，目的防止 直接 new
//    //2.去掉setXxx方法，方式属性被修改
//    //3，在Season 内部 直接创建固定的对象
//    private Season2(String name, String description) {
//        this.name = name;
//        this.description = description;
//    }
//}





