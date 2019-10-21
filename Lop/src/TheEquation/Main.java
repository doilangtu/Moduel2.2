package TheEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Equation equation = new Equation();

        System.out.println("nhap vao a");
        equation.setA(scanner.nextDouble());
        System.out.println("nhap vao b");
        equation.setB(scanner.nextDouble());
        System.out.println("nhap vao c");
        equation.setC(scanner.nextDouble());

        if(equation.getA() == 0){
            if (equation.getB()==0){
                if (equation.getC()==0){
                    System.out.println("Pt  vo so nghiem");
                }else {
                    System.out.println("pt vo nghiem");
                }
            }else {
                System.out.println("phuong trinh co nghiem la : " + -equation.getB()/equation.getA());
            }
        }else {
            if (equation.getCaculation()<0){
                System.out.println("phuong trinh vo nghiem");
            }else if (equation.getCaculation() == 0){
                System.out.println("phuong trinh co nghiem kep :" + equation.getNghiemKep());
            }else {
                System.out.println("phuong trinh co nghiem x1 = " +equation.getNghiem2()+
                        "phuong trinh co nghiem x2 = "+equation.getNghiem3());
            }
        }




    }
}
