import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class minArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size ;
        do{
            System.out.println("nhap size");
            size= scanner.nextInt();
            if(size >20){
                System.out.println("Size should not exceed 20");
            }

        }while (size >20);
        int [] arr =  new int[size];
        for (int i =0 ;i<size;i++){
            System.out.printf("a[%d] = " ,i);
            arr[i] = scanner.nextInt();
        }
        int min = minArr(arr);
        System.out.println("hien thi mang");
        show(arr);
        System.out.println("number min of array is : " + min );

    }
    public static int minArr (int [] arr){
        int min = arr[0];

        for (int  i = 0 ; i< arr.length;i++){
            if (arr[i]<min){
                min = arr[i];

            }
        }
        return min;
    }
    public static void show(int[] arr){
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
