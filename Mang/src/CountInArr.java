import java.util.Scanner;

public class CountInArr {
    public static void main(String[] args) {
        int size;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        //khoi tao mang
        System.out.println("khoi tao mang bat ki");
        String arr = scanner.nextLine();


        //phan tu dem
        System.out.println("phan  tu k");
        String k = scanner.nextLine();
        //duyet mang
        for (int i = 0;i<arr.length();i++){
            if (arr.charAt(i) == k.charAt(0)){
                count ++;
            }
        }
        System.out.println("So lan xua hien cua tu trong chuoi " + k + " la :" +count);
    }
}
