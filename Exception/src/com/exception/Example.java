package com.exception;

import java.util.Scanner;

public class Example {

    public void Division(int a, int b) throws ArithmeticException {
        int result = a / b; // Might throw ArithmeticException if b == 0
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Example e = new Example();
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Enter first number (a): ");
            int a = s.nextInt();

            System.out.print("Enter second number (b): ");
            int b = s.nextInt();

            e.Division(a, b);

        } catch (ArithmeticException e1) {
            System.out.println("Cannot divide by zero: " + e1.getMessage());
        } catch (Exception e2) {
            System.out.println("Invalid input: " + e2.getMessage());
        } finally {
            System.out.println("Execution completed.");
            s.close();
        }
    }
}
