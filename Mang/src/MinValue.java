import java.util.Scanner;

public class MinValue {
    public static int MinArray(int[] array) {

        int min = array[0];
        int index = 0;
        for (int i = 1;i <array.length;i++){
            if (array[i]<min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7};
        int min = MinArray(array);
        System.out.println(min);
    }
}


