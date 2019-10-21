package Triangle;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Shape shape = new Shape();
        System.out.println("The color of Triangle");
        shape.setColor(sc.nextLine());
        Shape triangle  =new Triangle();
        System.out.println("Enter edge1");
        ( (Triangle)triangle).setSide1(sc.nextFloat());
        System.out.println("Enter edge2");
        ( (Triangle)triangle).setSide2(sc.nextFloat());
        System.out.println("Enter edge3");
        ( (Triangle)triangle).setSide3(sc.nextFloat());
        System.out.println("Enter height");
        ( (Triangle)triangle).setHeight(sc.nextFloat());

        System.out.println(shape.toString());
        System.out.println(((Triangle)triangle));

    }
}
