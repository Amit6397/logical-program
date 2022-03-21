package logicalProgram.evenAndOddNumber;

import java.util.Scanner;

public class EvenNumberScannerClass {
    public static void main(String[] args) {
        int number,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        number=sc.nextInt();
        System.out.print("list of the even number=");
        for (i=1;i<=number;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
