import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        //bien

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        int i = 2;
        int dem =0;
        while (true){
            if (i==2){
                dem ++;
                System.out.println(i);
                i++;
                continue;
            }
            if (checkSTN(i)){
                dem++;
            }
            if (dem ==n){
                break;
            }

            i = i+1;
        }


    }
    public static boolean checkSTN(int n){
        for (int i = 2;i <=Math.sqrt(n);i++) {
            if (n % i == 0)
                return false;
        }
        System.out.println(n);
        return true;
    }
}
