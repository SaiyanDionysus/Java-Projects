//Write a Java program to print the sum of two numbers.
//Test Data:
//74 + 36
//Expected Output :
//110

import java.util.*;

public class tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("Sum of the numbers: " + result);
    }
}