package fanboy;

import org.junit.Test;

import static fanboy.IAmFan.FAST;
import static org.junit.Assert.*;

public class IAmFanTest {
    private final double DELTA = 0.00000001;

    @Test
    public void getSpeed() {
        IAmFan iAmFan = new IAmFan();
        iAmFan.setSpeed(FAST);
        int expected = 3;
        int actual = iAmFan.getSpeed();
        assertEquals(expected, actual);
    }

    @Test
    public void isOn() {
        IAmFan iAmFan = new IAmFan();
        boolean expected = true;
        boolean actual = iAmFan.setOn(true);
        assertEquals(expected, actual);
    }

    @Test
    public void getRadius() {
        IAmFan iAmFan = new IAmFan();
        iAmFan.setRadius(5.0);
        double expected = 5.0;
        double actual = iAmFan.getRadius();
        assertEquals(expected, actual,DELTA);
    }

    @Test
    public void getColor() {
        IAmFan iAmFan = new IAmFan();
        iAmFan.setColor("Purple");
        String expected = "Purple";
        String actual = iAmFan.getColor();
    }

}