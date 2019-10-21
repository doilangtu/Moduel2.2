package HCN;

public class Rectangle {
   private double height,width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return this.width *this.height;
    }
    public double getPerimeter(){
        return (this.width +this.height)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}

