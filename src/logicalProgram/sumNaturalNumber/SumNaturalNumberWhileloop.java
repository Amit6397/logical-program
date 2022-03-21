package logicalProgram.sumNaturalNumber;

import java.util.Scanner;

public class SumNaturalNumberWhileloop {
    public static void main(String[] args) {
        int num,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        i=sc.nextInt();
        System.out.println("sut up number");
        num=sc.nextInt();
        while (i<=num){
            sum=sum+i;

            i++;
        }
        System.out.println("sum of number="+sum+" ");
    }
}
