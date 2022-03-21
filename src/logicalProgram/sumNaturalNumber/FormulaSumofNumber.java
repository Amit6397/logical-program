package logicalProgram.sumNaturalNumber;

public class FormulaSumofNumber {
    static int sumOfNaturalNumbers(int n) {
        return n*(n+1)/2;

    }

    public static void main(String[] args) {
        int n=1000;
        System.out.println("Sum of natural number:"+sumOfNaturalNumbers(n));
    }
}
