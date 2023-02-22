
public class InterfaceDemo {
    public static void main(String[] args) {
        smartPhoneInterface motorola = new MOTO();
        motorola.setAlarm();
        motorola.switchOnFlash();
        System.out.println(motorola.screenRefreshing());

        System.out.println();

        smartPhoneInterface sony = new samsung();
        sony.setAlarm();
        sony.switchOnFlash();

        System.out.println(sony.screenRefreshing());
    }
}

class MOTO implements smartPhoneInterface{
    public void setAlarm(){
        System.out.println("moto's alarm is set");
    }
    public void switchOnFlash(){
        System.out.println("moto's flash is switched on");
    }
    public int screenRefreshing() {
        return 144;
    }
}

abstract class SONY implements smartPhoneInterface{
    public void setAlarm(){
        System.out.println("sony's alarm is set");
    }
    public void switchOnFlash(){
        System.out.println("sony's flash is switched on");
    }
//    public int screenRefreshing() {
//        return 60;
//    }



}

class samsung extends SONY{
    public int screenRefreshing() {
        return 60;
    }
}
