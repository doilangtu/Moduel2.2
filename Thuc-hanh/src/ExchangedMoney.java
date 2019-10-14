import java.util.Scanner;

public class ExchangedMoney {
    public static void main(String[] args) {
        //khai bao
        int rate = 23000;
        double usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of money you want exhanged from Usd to vnd");
        usd = scanner.nextDouble();
        double vnd = rate*usd;
        System.out.println("Amount of money is exchanged "+vnd);
    }

}
