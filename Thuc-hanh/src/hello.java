import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fullname");
        String fullname = scanner.nextLine();
        System.out.println("Hello "+fullname);
    }
}
