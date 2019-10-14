import java.util.Scanner;

public class CaculationWeight {
    public static void main(String[] args) {
        //khai bao bien
        double height  =1.0;
        double weight = 1.0;
        //khoi tao doi tuong
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height of you");
        height = scanner.nextDouble();
        System.out.println("enter weight of you ");
        weight = scanner.nextDouble();
        //dinh dang lai
        height = Math.abs(height);
        weight = Math.abs(weight);
        double bmi ;
        if (height ==0||weight==0)
            System.out.println("Bmi invalid !!!");

        bmi = weight/Math.pow(height,2);

        if (bmi<18.5){
            System.out.println("Underweight");
        }else if (18.5<=bmi && bmi<=25){
            System.out.println("Normal");
        }else if(25.0<=bmi && bmi <=30.0){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }

    }
}
