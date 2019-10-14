import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Merge {
    public  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       float[]  a = null;
       float[]  b = null;
       float[]  c = null;
        System.out.println("----nhap a-----");
        a = input(a);
        System.out.println("----nhap b-----");
        b = input(b);
        //tron
        c = merge(a,b);
        //in mang
        show(c);



    }
    public static float[] input(float[] arr){
        System.out.println("nhap phan tu n");
        int n = scanner.nextInt();
        //tao mang
        arr = new float[n];
        for (int i = 0;i<n;i++){
            System.out.printf("a[%d] = ",i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static void sortABC(float [] arr){
        float temp = arr[0];
        for (int i = 0;i <arr.length-1;i++){
            for (int j = 0 ; j <arr.length;j++){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i ] = temp;
            }
        }
    }//tron mang
    public static float [] merge(float [ ] a , float [] b){
        int aIndex  = a.length -1;
        int bIndex = b.length -1;
        int cIndex = a.length + b.length -1;
        float []c = new float [cIndex+1];
        //sap xep mang truogc
        sortABC(a);
        sortABC(b);
        //tron voi dieu c phai tng dan
        for(int i= cIndex;i > -1;i--){
            if (aIndex > -1 && bIndex  > -1){
                if (a[aIndex] > b[bIndex]){
                    c[i] =  a[aIndex--];
                }else {
                    c[i] = b[bIndex--];
                }
            }else if (bIndex == -1){
                c[i] = a[aIndex--];
            }else if(aIndex == -1){
                c[i] = b[bIndex--];
            }
        }
        return c;
    }
    public static void show(float[]arr){
       for (int i = 0;i<arr.length;i++){
           System.out.print(arr[i] + " ");
       }
    }
}
