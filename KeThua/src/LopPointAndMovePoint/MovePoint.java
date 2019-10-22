package LopPointAndMovePoint;

import java.util.Arrays;

public class MovePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovePoint() {
    }

    public MovePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public float[] getSpeed(){
        float [ ] arr = {getxSpeed(),getySpeed()};
        return arr;
    }
    public MovePoint move(){
        float x = getX();
        float y = getY();
        x += this.xSpeed;
        y += this.ySpeed;
        setY(y);
        setX(x);
        return this;
    }


    public String toString(){
        return "Toa do sau khi tang la "+
                "x = "+super.getX()
                        +"\n y ="+super.getY()
                +
                "\n speed = "+ Arrays.toString(getSpeed());
    }
}
