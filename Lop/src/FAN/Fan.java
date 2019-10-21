package FAN;

public class Fan {

    private final int slow =1;
    private final int medium =2;
    private final int fast =3;
    private int speed  = slow;
    private boolean on =false;
    private double radius = 5;
    private String color = "red";
    public void Fan(){

    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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


    public String Fan1() {
        return "Fan1{" +
                "slow=" + this.getSlow() +
                "speed " +this.getSpeed()+
                "Status :" +on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }


    public String Fan2() {
        return "Fan2{" +
                "speed " +this.getSpeed()+
                "Status :" +on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}