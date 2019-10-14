import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        //khoi tao mang
        int size;
        int count = 0;
        Scanner scanner
                 = new Scanner(System.in);

         do {
             System.out.println("nhap size");
              size = scanner.nextInt();
             if (size >30)
                 System.out.println("size should not exceed 30");
         }while (size >30);
         int[]arr = new int[size];

         for (int  i = 0;i<arr.length;i++){
             System.out.printf(" diem hoc sinh a[%d] = ",i);
             arr[i] = scanner.nextInt();
         }
        System.out.println("hien thi mang");
        show(arr);
        count = checkMark(arr,count);
        System.out.println("so hoc thi do la " +count);

    }
    public  static  void show(int[]arr){
        for (int i = 0;i <arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int checkMark(int []arr,int count) {
        count = 0;
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] < 10) {
                count++;
            }
        }
      return count;

    }

}
