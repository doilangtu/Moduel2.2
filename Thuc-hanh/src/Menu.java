import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice ;
        //khoi tao doi tuong
        Scanner scanner = new Scanner(System.in);
        //khoi tao menu
        System.out.println("Menu");
        System.out.println("1.Draw triangle ");
        System.out.println("2.Draw the squarce");
        System.out.println("3.Draw the rectangle");
        System.out.println("0.Exit");
        System.out.println("Enter your choice");
        choice = scanner.nextInt();
        switch (choice){
            case  1:
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
