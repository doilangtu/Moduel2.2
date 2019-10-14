import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a,b;
        //khoi tao doi tuong
        Scanner scanner = new Scanner(System.in);;
        System.out.println("Nhap a");
        a =scanner.nextInt();
        System.out.println("Nhap b");
        b = scanner.nextInt();
        a  =Math.abs(a);
        b = Math.abs(b);
        if (a ==0 ||b ==0){
            System.out.println("No great commons factors");
        }
        while (a!=b){
            if (a> b)
                a =a-b;
            else
                b= b -a;

        }
        System.out.println("Greatest common factor " +a);
    }
}
