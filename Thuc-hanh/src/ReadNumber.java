import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        //khai doi tuong
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number  = scanner.nextInt();
        String charisterOfNumber ;
        switch (number){
            case 1:
                charisterOfNumber = "one";
                break;
            case 2:
                charisterOfNumber = "two";
                break;
            case 3:
                charisterOfNumber ="three";
            break;
            case 4:
                charisterOfNumber ="four";
                break;
            case 5:;
                charisterOfNumber ="five";
                break;
            case 6:
                charisterOfNumber ="six";
                break;
            case 7:
                charisterOfNumber ="seven";
                break;
            case 8:
                charisterOfNumber ="nine";
                break;
            default:
                charisterOfNumber = "";
                break;

        }
        if (charisterOfNumber!=""){
            System.out.printf("Doc thanh chu la %s" ,charisterOfNumber);
        }else {
            System.out.println("invalid");
        }
    }
}
