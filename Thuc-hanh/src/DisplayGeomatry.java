import java.util.Scanner;

public class DisplayGeomatry {
    public static void main(String[] args) {
        //khoi tao doi tuong
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int num = scanner.nextInt();
        System.out.println("Enter choice of you");
        int choice = scanner.nextInt();
        //tao menu
        System.out.println("1.Print the rectagle");
        System.out.println("2.Print the square triagle");
        System.out.println("3Print iosceles triagle");
        System.out.println("4.Exit");
        switch (choice){
            case 1:
                System.out.println("Hcn");
                    HCN();
                break;
            case 2:
                System.out.println("tam giac");
                TamGiac(num);
                break;
            case 3:
                System.out.println("tam giac nguoc");
                TamGiacNguoc(num);
                break;
            case 4:
                System.exit(4);
                break;
            default:
                break;

        }


    }
    public static void HCN() {
        for (int i = 0; i < 3; i++)
            System.out.println("********");

    }
    public static void TamGiac(int a) {
        for (int r = 1; r <= a; r++) {
            // phần 1
            for (int sp = a - r + 1; sp >= 1; sp--) {
                System.out.print(" ");
            }
            // phần 2
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            //3
            for (int c = r - 1; c >= 1; c--) {
                System.out.print("*");
            }
            System.out.println();
        }}
    public static void TamGiacNguoc(int a){
            for (int r = 1; r <= a; r++) {
                // phần 1
                for (int sp = 1; sp <= r; sp++) {
                    System.out.print(" ");
                }
                // phần 2
                for (int c = 1; c <= a; c++) {
                    System.out.print("*");
                }
                // phần 3
                for (int c = a - r; c >= 1; c--) {
                    System.out.print("*");
                }
                a--;
                System.out.println();
            }
    }
}
