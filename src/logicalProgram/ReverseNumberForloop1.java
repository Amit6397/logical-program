package logicalProgram;

public class ReverseNumberForloop1 {
    public static void main(String[] args) {
        int number=123456789,reverse=0;
        for (;number!=0;){
            int remainder = number%10;
            reverse = reverse*10+remainder;
            number = number/10;
        }
        System.out.println("reverse of the number" +reverse);

    }
}
