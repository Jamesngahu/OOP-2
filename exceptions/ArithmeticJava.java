package exceptions;
import java.io.*;

public class ArithmeticJava {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 0;
        try {
            int ans = num1 / num2;
            System.out.println("Answer:" + ans);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed!");
        }
        finally {
            System.out.println("Program continues normally after the exception is handled.");
        }
    }
}