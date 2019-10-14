import java.util.Scanner;

public class FoundStudentsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name students you  want to found ");
        String input_name =scanner.nextLine();
        //tao mang
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean isExit = false;
        for (int i = 0;i<students.length;i++){
            if (students[i].equals(input_name)){
                System.out.println("The students found is :" +input_name +" at "+ (i+1));
                isExit =true;
                break;
            }

        }
        if (!isExit)
            System.out.println("No found "+ input_name +"in the list");
    }
}

