package logicalProgram.sumNaturalNumber;

import java.util.Scanner;

public class SumNumberScannerClassForloop {
    public static void main(String[] args) {
        int num,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        num =sc.nextInt();

        for (i=1;i<=num;i++){
            sum=sum+i;

        }
        System.out.println("Sum of to number="+sum+" ");
    }
}
