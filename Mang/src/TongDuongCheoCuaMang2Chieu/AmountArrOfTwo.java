package TongDuongCheoCuaMang2Chieu;

import java.util.Scanner;

public class AmountArrOfTwo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap so dong");
         int row = scanner.nextInt();
        System.out.println("nhap so cot");
        int column = scanner.nextInt();
        //mang
        int[][]matrix= new int[row][column];
        //khai bao
        System.out.println("Enter  arr" +matrix.length + "row and"+matrix[0].length+" column");
        for (row = 0;row<matrix.length;row++){
            System.out.println(" ");
            for (column = 0;column<matrix[row].length;column++){
                matrix[row][column] = scanner.nextInt();
            }

        }
        //in mang
        System.out.println("mang la");
        for (row = 0;row<matrix.length;row++){
            System.out.println(" ");
            for (column = 0;column<matrix[row].length;column++){
                System.out.printf("%d ",matrix[row][column]);
            }}
        int total = 0;

        for (row = 0;row<matrix.length;row++){
            for (column  =matrix[row].length-1 ;column>=0;column--){
                if (row ==column)
                total += matrix[row][column];

            }}
        System.out.println("tong duong cheo"+total);
    }
}
