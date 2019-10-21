package LopCircleAndLopCyclinder;

public class Cylinder  extends Circle{
    private double height;
    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getAreaCylinder(){
        return 2*Math.PI*this.getRadius()*height;
    }
    public double getTotalAreaCylinder(){
        return 2*Math.PI*this.getRadius()*(this.getRadius()+height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "\nradius=" + super.getRadius() +
                "\nHeight = "+this.height+
                "\nThe pull of Cylinder = "+this.getAreaCylinder()
                +"\nThe total area of Cylinder = "+this.getTotalAreaCylinder()
                +
                '}';
    }
}
