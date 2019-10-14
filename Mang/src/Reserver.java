import java.util.Scanner;

public class Reserver {
    public static void main(String[] args) {
        //khai bao size
        Scanner scanner = new Scanner(System.in);
        int size;
        int[]array;
        do {
            System.out.println("enter size");
            size = scanner.nextInt();
            if (size>20)
                System.out.println("Size does not exceed");
        }while (size>20);
            //nhap mang
        array = new int[size];
        int i = 0;
        for (;i<array.length;i++){
            System.out.println("Enter elemnet "+ (i+1) +" :");
            array[i] = scanner.nextInt();

        }
        //display list
        System.out.printf("%-20s%s" ,"Element array :","");
        for (int j = 0;j<array.length;j++){
            System.out.println(array[j] +"\t");
        }
        //doi gia tri
        for (int j = 0;j<array.length/2;j++){
            int temp  = array[j];
            array[j]=array[size -1 -j];
            array [size -1 -j] = temp;
        }
        //print reverse
        System.out.printf("%-20s%s" ,"element reverse array :","");
        for (int j = 0;j<array.length;j++){
            System.out.println(array[j]+"\t");
        }

    }
}
