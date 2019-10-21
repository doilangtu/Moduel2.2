package ThucHanhShape;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle (){
    }
    public Circle(double radius){
        this.radius =radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Color Cirlce :"+ super.getColor()
                + " \nfilled " +super.isFilled()
                + " \nRadius  : " +this.radius
                +"  \narea of circle is  : "+this.getArea()
                + "\nPerimeter of Circle is : "  +this.getPerimeter();
    }
}

