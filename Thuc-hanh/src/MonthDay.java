import java.util.Scanner;

public class MonthDay {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Which the month you want to check have count day ?");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31 day";
                break;
            case 2:
                daysInMonth = "29 day or 31 day";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth ="30 day";
                break;
            default:
                daysInMonth ="";
                break;

        }
        if(daysInMonth !=""){
            System.out.printf("The month '%d' has %s days !",month,daysInMonth);
        }else {
            System.out.println("The day invalid !!!");
        }

    }
}
