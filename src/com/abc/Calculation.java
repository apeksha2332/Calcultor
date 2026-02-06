package com.abc;
import java.util.*;
public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();

	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();

	        System.out.print("Choose operation (+, -, *, /): ");
	        char operator = sc.next().charAt(0);

	        double result;

	        switch (operator) {
//	            case '+':
//	                result = num1 + num2;
//	                System.out.println("Result: " + result);
//	                break;

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

	        sc.close();
	        
	        System.out.print("Apeksha");

	}

}


