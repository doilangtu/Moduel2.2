import java.util.Scanner;
public class DeleteArr{
public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);

        do {
        System.out.println("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
        } while (n <= 0);

        int[] Arr = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
        System.out.printf("a[%d] :" , i);
        Arr[i] = scanner.nextInt();
        }

        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();

        for (c = i = 0; i < n; i++) {
        if (Arr[i] != k) {
        Arr[c] = Arr[i];
        c++;
        }
        }

        n = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
        System.out.print(Arr[i] + "\t");

        }
        }}