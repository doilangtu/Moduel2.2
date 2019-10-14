import java.util.Scanner;

public class ExchangedTemperature {
    public static void main(String[] args) {
        //khoi tao doi tuong
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice ;

        // khoi tao menu
        do {
            System.out.println("Menu");
            System.out.println("1.Fahrenheit to Celsius");
            System.out.println("2.Celsius to Fahrenheit");
            System.out.println("3.Exit");
            System.out.println("Enter choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahreheit to Celsius "+fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius");
                    celsius = scanner.nextDouble();
                    System.out.println("Celcius to Fahrenheit " +celsiusToFahrenheit(celsius));
                    break;
                case 3:
                    System.exit(3);

            }
        }while (choice!=0);


    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
