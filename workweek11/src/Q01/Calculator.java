package calculate.Q01;

import java.nio.channels.ScatteringByteChannel;

public class Calculator {
    //  int a;
    // int b;
    public void addition(int a, int b) {
        System.out.println("Addition of a+b :" + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println("Subtraction of 2 numbers :" + (a - b));
    }

    public void multiplication(int a, int b) {
        System.out.println("Multiplication of a and b :" + (a * b));
    }

    public void division(int a, int b) {
        System.out.println("Division of a and b :" + (a / b));
    }

    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);

        } else if (symbol == '*') {
            multiplication(a, b);

        } else if (symbol == '/') {
            try {
                if (b == 0) {
                    //   System.out.println(a/0);
                    System.out.println("division not possible");
                }


            } catch (Exception e) {
                division(a, b);

            } finally { //always executed and used for safest code
                division(a, b);
            }
        }
    }
}