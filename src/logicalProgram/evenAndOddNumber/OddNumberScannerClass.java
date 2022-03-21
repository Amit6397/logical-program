package logicalProgram.evenAndOddNumber;

import java.util.Scanner;

public class OddNumberScannerClass {
    public static void main(String[] args) {

        int number,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number limit");
        number=sc.nextInt();

        System.out.print("List of odd number");
        //System.out.println("list of even number");

        for ( i=1;i<=number;i++){
            if (i%2!=0){
                System.out.println(i+" ");
            }

            //System.out.println(i+" ");

        }
    }
}
