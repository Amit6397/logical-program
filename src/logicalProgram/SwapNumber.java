package logicalProgram;

public class SwapNumber {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("values before swapping");
        System.out.println(a+" "+b+" ");

        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("values after swapping");
        System.out.println(a+" "+b+" ");
    }
}
