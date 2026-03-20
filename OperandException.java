import java.util.*;
public class OperandException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numerator = 10;
        int denominator = 0;
        try {
            int result = denominator / numerator;
            System.out.println("Result :" + result);
        } catch (ArithmeticException e) {
            System.out.println("Ëxception found" + e);
        } finally {
            System.out.println("Finally block executed:");

        }

    }
}