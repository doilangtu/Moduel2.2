import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import java.util.Scanner;
import java.util.Arrays;
public class AddArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("so phan tu mang");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Nhap mang");
        for (int i=0;i<n;i++){
            System.out.printf("a[%d] =",i);
            arr[i]=sc.nextInt();
        }
        //in mang
        System.out.println(Arrays.toString(arr));//in mang arr
        System.out.println("nhap k");
        int k= sc.nextInt();
        int i;
        do {
            System.out.println("enter index");
            i= sc.nextInt();
        }while (i<0||i>arr.length);
        int []newArr= new int[arr.length+1];
        System.arraycopy(arr,0,newArr,0,arr.length);
        if (i==arr.length){
            {
                int value= newArr[newArr.length-2];
                newArr[newArr.length-2]=k;
                newArr[newArr.length-1]=value;
                System.out.println(Arrays.toString(newArr));//in mang newarr
            }
        }else {
            for (int j = 0; j < newArr.length; j++) {
                if (i <= j) {
                    int value = newArr[j];
                    newArr[j] = k;
                    k = value;
                }
            }
            System.out.println(Arrays.toString(newArr));//in mang arr
        }
        // chen element vao mang
    }
}
