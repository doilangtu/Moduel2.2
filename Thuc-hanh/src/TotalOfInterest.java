import java.util.Scanner;

public class TotalOfInterest {
    public static void main(String[] args) {
        //khoi tao bien
        double money = 1.0;
        int month  = 1;
        double inter_rate = 1.0;
        //khok tao doi tuong
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money received ");
        money =scanner.nextDouble();
        System.out.println("Enter month received");
        month =scanner.nextInt();
        System.out.println("Enter annual inter rate in percentage");
        inter_rate = scanner.nextDouble();
        //tinh lai
        double total_interest = 0;
        for (int i = 0;i <month;i++){
            total_interest = money*(inter_rate/100)/12*3;
        }
        System.out.println("Total interest :" +total_interest);
    }
}
