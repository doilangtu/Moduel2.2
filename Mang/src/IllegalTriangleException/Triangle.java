package IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        IllegalTriangleException st = new IllegalTriangleException();
         try{
             do {
                 System.out.println("nhap a");
                 a = sc.nextInt();
                 System.out.println("nhap b");
                 b= sc.nextInt();
                 System.out.println("nhap c");
                 c = sc.nextInt();
             }while (st.checkABC( a,b,c)== 0);
                 System.out.println("1 tam giac");
         }catch (Exception e){
             System.out.println("k phai canh 1 tam giac");
         }

    }
}
