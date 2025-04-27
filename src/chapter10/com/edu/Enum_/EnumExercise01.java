package chapter10.com.edu.Enum_;

public class EnumExercise01 {
    public static void main(String[] args) {

    }
}
/**
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
 */