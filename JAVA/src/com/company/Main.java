package com.company;
import java.util.Scanner;
public class Main {
    public static double sum(double x, double y) {
        double sum = x + y;
        return sum;
    }
    public static double subtraction(double x, double y) {
        double subtraction = x - y;
        return subtraction;
    }
    public static double multiplication(double x, double y) {
        double multiplication = x * y;
        return multiplication;
    }
    public static double divide(double x, double y) {
        double divide = x / y;
        return divide;
    }
    public static void main(String[] args) {
        Scanner sun = new Scanner(System.in);
        double n1, n2, answer = 0;
        int x;

        System.out.println("press num 1 for summation");
        System.out.println("press num 2 for subtraction");
        System.out.println("press num 3 for multiplication");
        System.out.println("press num 4 for divide");
        System.out.println("press your option :");
        x = sun.nextInt();

        System.out.println("Enter your first number :");
        n1 = sun.nextInt();
        System.out.println("Enter you second number :");
        n2 = sun.nextInt();

        switch (x) {
            case 1:
                answer = sum(n1, n2);
                break;

            case 2:
                answer = subtraction(n1, n2);
                break;

            case 3:
                answer = multiplication(n1, n2);
                break;

            case 4:
                answer = divide(n1, n2);
                break;
            default:
                System.out.println("invalid operator");
        }
        System.out.println("Answer is " + answer);
    }
}
