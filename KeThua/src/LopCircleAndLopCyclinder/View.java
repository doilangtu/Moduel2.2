package LopCircleAndLopCyclinder;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        Circle circle  =new Circle();
        System.out.println("Enter radius");
        circle.setRadius(scanner.nextDouble());

        Circle cylinder  =new Cylinder();
        System.out.println("Enter height");
        ((Cylinder)cylinder).setHeight(scanner.nextDouble());

        System.out.println(circle.toString());
        System.out.println((Cylinder)cylinder);
    }
}
