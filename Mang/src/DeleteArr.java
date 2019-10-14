import java.util.Scanner;

public class DeleteArr {
    public static void main(String[] args) {
        int size,i,c;
        Scanner scanner = new Scanner(System.in);

        //
        do {
            System.out.println("nhap so phan tu cuar mang");
            size = scanner.nextInt();
        }while (size >20);
        int [] arr = new int [ size];
        System.out.println("nhap cac phan tu trong mang");
        for ( i= 0 ; i<size;i++){
            System.out.printf("a[%d] = ",i);
            arr[i] = scanner.nextInt();
        }
        // phan tu  k
        System.out.println("nhap phan tu k");
        int k = scanner.nextInt();
        //sap xep
        for ( c=i=0;c<arr.length;i++){
            if (arr[i] != k){
                arr[c] = arr[i];
                c++;
            }
        }
        size = c;
        System.out.println("mang sau khi xoa la " + k );
        for (i = 0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }


}
