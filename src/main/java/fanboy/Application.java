package fanboy;

import static fanboy.IAmFan.FAST;
import static fanboy.IAmFan.MEDIUM;

public class Application {
    public static void main(String[] args) {
        IAmFan iAmFan = new IAmFan();
        iAmFan.setSpeed(FAST);
        iAmFan.setRadius(10);
        iAmFan.setColor("yellow");
        iAmFan.setOn(true);
        System.out.println(iAmFan.toString() + "\n");

        iAmFan.setSpeed(MEDIUM);
        iAmFan.setRadius(5);
        iAmFan.setColor("blue");
        iAmFan.setOn(false);
        System.out.println(iAmFan.toString());
    }
}
