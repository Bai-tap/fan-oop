package fanboy;

public class IAmFan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public IAmFan() {
    }

    public int getSpeed() {
        return speed;
    }

    public int setSpeed(int speed) {
        return this.speed;
    }

    public boolean isOn() {
        return on;
    }

    public boolean setOn() {
        return this.on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (isOn()) {
            return "Speed: " + getSpeed() + "\nColor: "+getColor() + "\nRadius: "+ getRadius() + "\nfan is on";
        } else return "Speed: " + getSpeed() + "\nColor: "+getColor() + "\nRadius: "+ getRadius() + "\nfan is off";
    }
}
