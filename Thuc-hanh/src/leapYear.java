import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        //khoi tao doi tuong
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();

        boolean isLeapYear =true ;

        if (year%4==0){
            if(year%100 ==0){
                if(year%400 ==0){
                    isLeapYear = true;
                }
            }
        }else {
            isLeapYear = false;
        }
        if(isLeapYear){
            System.out.println(year+" is a leap year");
        }else {
            System.out.println(year+" is not a leap year");
        }
    }
}
