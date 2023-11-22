package calculate.Q01;

import calculate.Q01.Calculator;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Calculator t = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstno = scanner.nextInt();
        System.out.println("Enter second nunber");
        int secondno = scanner.nextInt();
        System.out.println("enter one of the symbol +,-,*,/ ");
        char symbol = scanner.next().charAt(0);
        t.calculateResult(firstno, secondno, symbol);
        System.out.println("Would you like to do more calculation");
        char value = scanner.next().charAt(0);
        while (value == 'y') {
            System.out.println("Enter first number");
            firstno = scanner.nextInt();
            System.out.println("Enter second nunber");
            secondno = scanner.nextInt();
            System.out.println("enter one of the symbol +,-,*,/ ");
            symbol = scanner.next().charAt(0);
            t.calculateResult(firstno, secondno, symbol);
            System.out.println("Would you like to do more calculation");
            value = scanner.next().charAt(0);
        }
        System.out.println("Program terminated");
        System.exit(0);


    }
}
