
public class AbstractClass {
    public static void main(String[] args) {
        smartPhone motorola = new MOTO();
        motorola.setAlarm();
        motorola.switchOnFlash();
        System.out.println(motorola.screenRefreshing());

        smartPhone sony = new SONY();
        sony.setAlarm();
        sony.switchOnFlash();
        System.out.println(sony.screenRefreshing());
    }
}

abstract class smartPhone{
    public void setAlarm(){
        System.out.println("alarm is set");
    }
    public void switchOnFlash(){
        System.out.println("flash is switched on");
    }
    public abstract int screenRefreshing();
}

class MOTO extends smartPhone{
    public int screenRefreshing() {
        return 144;
    }
}

class SONY extends smartPhone{
    public int screenRefreshing() {
        return 60;
    }
}
