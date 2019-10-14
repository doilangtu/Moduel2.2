import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        //khai bao doi tuong
        Scanner scanner = new Scanner(System.in);
        //nhap
        System.out.println("Enter number ");
        int number = scanner.nextInt();
        if (number < 2){
            System.out.println("Number is not prime");
        }else {
            int i = 2;
            boolean check = true;
            while (i<=Math.sqrt(number)){
                if (number%2 == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println("Number is prime");
            }else {
                System.out.println("Number is not prime");
            }
        }
    }
}
