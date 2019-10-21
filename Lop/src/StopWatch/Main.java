package StopWatch;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int[] createRandom() {
        Random rd = new Random();
        int[] arr = new int [100000];
        System.out.println("danh sach phan tu ");
        for (int i = 0; i < 100000; i++) {
            arr[i] = rd.nextInt(100000);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
    // hàm này  l?y random m?ng int d? có cái mà check th?i gian,
    public static void main(String[] args) {
        StopWatch st = new StopWatch();
        st.start();
        int [] a = createRandom();
        sortSc(a);
        int max=a[0];
        findMinArrSortSc(a, max);
        System.out.println("\n sort a= " + Arrays.toString(a));
        System.out.println("max = "+max);
        st.stop();
        System.out.println("time = " + st.getElapsedTime());
    }



    private static void sortSc(int [] a) {
        int temp;
        for(int i = 0; i<a.length-1; i++){
            for (int j =i+1;j<a.length;j++){
                if (a[i]>a[j]){
                    temp =a[j];
                    a[j] =a[i];
                    a[i] =temp;
                }
            }

        }
    }
    private static void findMinArrSortSc(int[] a, int max) {
        for (int i = 1; i< a.length; i++) {
            if (max<a[i]){
                max=a[i];
            }
        }
    }


}