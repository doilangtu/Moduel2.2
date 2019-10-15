import java.util.Scanner;

public class AmountMatrix {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("nhap vao so dong");
        x = scanner.nextInt();
        int y;
        System.out.println("nhap vao so cot");
        y = scanner.nextInt();
        int[][] maxtrix = new int[x][y];
        System.out.println("Enter the" + maxtrix.length + " row.and " + maxtrix[0].length + " column");
        for (x = 0; x < maxtrix.length; x++) {
            System.out.println(" ");
            for (y = 0; y < maxtrix[x].length; y++) {
                maxtrix[x][y] = scanner.nextInt();
            }
        }
        //in ra mang
        System.out.println("mang laf");
        for (x = 0; x < maxtrix.length; x++) {
            System.out.println(" ");
            for (y = 0; y < maxtrix[x].length; y++) {
                System.out.printf("%d ", maxtrix[x][y]);
            }
        }
        //hoi
        int k;
        do {
            System.out.println("ban mun cong cot nao");
            k = scanner.nextInt();
        } while (k > x);
        //kiem tra k voi colum
        int total = 0;
        for (x = 0; x < maxtrix.length; x++) {
            System.out.println(" ");
            for (y = 0; y < maxtrix[x].length; y++) {
                if (y == (k - 1)) {
                    total += maxtrix[x][y];
                }
            }
        }
        System.out.println("tong cua cot ban chon co gia tri la :"+total);
    }

}
