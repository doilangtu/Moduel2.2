import java.util.Scanner;

public class MaxArr {
    public static void main(String[] args) {
        int [][]maxtrix = new int[2][2];
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter " +maxtrix.length +"rows and " +maxtrix[0].length +"columns");
        for (int row = 0;row <maxtrix.length;row++){
            for (int column = 0;column<maxtrix[row].length;column++){
                maxtrix[row][column] = scanner.nextInt();
            }
        }
        //in ra mang
        for (int row = 0;row <maxtrix.length;row++){
            for (int column = 0;column<maxtrix[row].length;column++){
                System.out.println(maxtrix[row][column]);
            }
            System.out.println();
        }
        //so lon nhat
        int max = maxtrix[0][0];int index =0;
        for (int i = 0;i <maxtrix.length;i++){
            for (int j = 0;j<maxtrix[i].length;j++){
                        if (max <maxtrix[i][j]){
                            max = maxtrix[i][j];
                        }
                        index = j;

            }
            System.out.println("so lon nhat la " +max + " row " +i +"colum"+ index);
        }
    }
}
