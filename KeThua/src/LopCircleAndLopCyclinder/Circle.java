package LopCircleAndLopCyclinder;

public class Circle {
    private double radius =1.0;

    public Circle() {
    }

    public Circle(double radius) {
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
        return "Circle{" +
                "\nArea of circle is :"+ this.getArea()+
                "\nPerimeter of Circle is :" +this.getPerimeter()+
                "\nradius=" + radius +
                '}';
    }
}
