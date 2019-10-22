package interfaceColorable;

import interfaceColorable.CheckColor.Colorable;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Shape [] shapes =new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5,7);
        shapes[2] = new Square(3,"red",false);

        for (int i = 0;i<shapes.length;i++){
            System.out.println(shapes[i]);
            if (shapes[i] instanceof Square){
                System.out.println(((Square) shapes[i]).howToColor());
            }
        }


    }


}
