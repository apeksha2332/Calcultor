package com.abc;
import java.util.*;
public class Calculation {

    public static void main(String[] args) {

        double num1 = 10.0;      // set your first number here
        double num2 = 5.0;       // set your second number here
        char operator = '+';     // set operation: +, -, *, /

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;     // fixed: + should add
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }

        System.out.print("Apeksha");
    }
}
