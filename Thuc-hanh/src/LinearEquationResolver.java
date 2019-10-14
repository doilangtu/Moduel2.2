import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        double a, b, c;
        //khai bao doi tuong
        Scanner scanner = new Scanner(System.in);
        //nhap gia tri a,b
        System.out.println("nhap a");
        a = scanner.nextDouble();
        System.out.println("nhap b");
        b = scanner.nextDouble();
        System.out.println("nhap c");
        c = scanner.nextDouble();
        if (a != 0) {
            double solution = (c - b) / a;
            System.out.printf("The soltion is %f!", solution);
        } else {
            if (b == 0) {
                System.out.println("The soltion is all x!");
            } else {
                System.out.println("No soltion");
            }
        }
    }
}
