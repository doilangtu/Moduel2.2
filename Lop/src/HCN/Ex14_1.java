package HCN;

import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap height");
        rectangle.setHeight(scanner.nextDouble());
        System.out.println("nhap width");
        rectangle.setWidth(scanner.nextDouble());
        System.out.println(rectangle.toString());
        System.out.println("Perimeter of the Rectangle :" +rectangle.getPerimeter());
        System.out.println("Area of the Rectangle :" +rectangle.getArea());
    }
}
