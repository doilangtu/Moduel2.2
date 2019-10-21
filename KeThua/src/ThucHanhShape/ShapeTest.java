package ThucHanhShape;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape circle = new Circle();
        System.out.println("color is");
        circle.setColor(sc.nextLine());
        System.out.println("true/false");
        circle.setFilled(sc.nextBoolean());
        System.out.println("radius");
        ((Circle) circle).setRadius(sc.nextDouble());
        sc.nextLine();
        Shape rectangle  =new Rectangle();

        System.out.println("color is ");
        rectangle.setColor(sc.nextLine());
        System.out.println("Enter width :");
        ((Rectangle) rectangle).setWidth(sc.nextDouble());
        System.out.println("Enter length :");
        ((Rectangle) rectangle).setLength(sc.nextDouble());
          Shape square =new Square();

        System.out.println((Circle) circle);
        System.out.println((Rectangle) rectangle);
        System.out.println((Square) square);

    }
}
