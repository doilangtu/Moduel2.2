package FAN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
       Scanner sc = new Scanner(System.in);

       Fan fan1 =new Fan();
       Fan fan2 =new Fan();
       fan1.setSpeed(fan1.getFAST());
       fan1.setOn(true);
       fan1.setColor("red");
       fan1.setRadius(5);
       fan2.setSpeed(fan1.getMEDIUM());
       fan2.setOn(false);
       fan2.setColor("blue");
       fan2.setRadius(10);

        System.out.println(fan1);
        System.out.println(fan2);

}}
