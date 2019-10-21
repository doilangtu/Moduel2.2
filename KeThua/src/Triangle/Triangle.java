package Triangle;

public class Triangle extends Shape{
    private float side1 =1.0f;
    private float side2 =1.0f;
    private float side3 =1.0f;
    private float height  = 1.0f;
    public Triangle(){

    }

    public Triangle(float side1, float side2, float side3, float height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    public Triangle(String color, float side1, float side2, float side3, float height) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    public float getArea(){
        return 2*this.height*this.side2;
    }
    public float getPerimeter(){
        return this.side2 +this.side1+this.side3;
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1 = " + super.getColor() +
                ", side1 = " + this.side1 +
                ", side2 = " + this.side2 +
                ",side3 = "+this.side3+
                ", height = " + height
                +"Area of Triangle :" +this.getArea()+
                "Perimeter of Triangle " + this.getPerimeter()+
                '}';
    }
}
