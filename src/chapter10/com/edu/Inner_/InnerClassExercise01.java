package chapter10.com.edu.Inner_;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床了");
            }
        });
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("闹钟换了");
            }
        });
        phone phone = new phone();
        phone.alarmclock(new AA() {
            @Override
            void ring() {
                System.out.println("这是基于类的匿名内部类");
            }
        });

    }
}

//铃声接口 Bell
interface Bell {
    void ring();
}

//手机类Cellphone
class Cellphone {
    public void alarmclock(Bell bell){
        bell.ring();
    }
}

abstract class AA{
    abstract void ring();
}

class phone {
    public void alarmclock(AA a){
        a.ring();
    }
}
