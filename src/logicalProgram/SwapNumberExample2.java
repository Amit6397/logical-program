package logicalProgram;

public class SwapNumberExample2 {
    static void swapNumber(int a,int b){
        System.out.println("before swapping values");
        System.out.println(a+" "+b+" ");

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("after swapping values ");
        System.out.println(a+" "+b+" ");
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;

        swapNumber(a,b);
    }
}