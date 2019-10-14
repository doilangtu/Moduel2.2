import java.util.Scanner;

public class AddArray{
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap phan tu n");
        int n = scanner.nextInt();
        int[] arr =new  int[n];

        for(int i = 0;i<n;i++){
            System.out.printf("a[%d]=",i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("int mang");
        show(arr);
    }
    public static void show(int []arr){
        for (int i = 0;i<arr.length;i++){
            System.out.printf("%s",arr[i]);
        }
    }
}