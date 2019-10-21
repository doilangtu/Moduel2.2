package Point2DAndPoint3D;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point2D point2D = new Point2D();
        System.out.println("enter x");
        point2D.setX(sc.nextFloat());
        System.out.println("Enter y");
        point2D.setY(sc.nextFloat());

        Point2D point3D = new Point3D();
        point3D.setX(point2D.getX());
        point3D.setY(point2D.getY());
        System.out.println("Enter z");
        ((Point3D)point3D).setZ(sc.nextFloat());
       // System.out.println(point2D.toString());
        System.out.println((Point3D)point3D);

    }
}
