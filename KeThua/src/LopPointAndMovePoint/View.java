package LopPointAndMovePoint;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point point = new Point();

        System.out.println("nhap x");
        point.setX(sc.nextFloat());
        System.out.println("nhap y");
        point.setY(sc.nextFloat());

        Point movePoint = new MovePoint();
        movePoint.setX(point.getX());
        movePoint.setY(point.getY());

        System.out.println("nhap xSPeed");
        ((MovePoint)movePoint).setxSpeed(sc.nextFloat());
        System.out.println("nhap ySPeed");
        ((MovePoint)movePoint).setySpeed(sc.nextFloat());
        System.out.println(point.toString());
        movePoint = ((MovePoint)movePoint).move();
        System.out.println(movePoint.toString());
    }
}
