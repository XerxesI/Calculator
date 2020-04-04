package com.example.java;

import java.util.Scanner;

import static com.example.java.util.MathMethods.*;

public class Calculator {

    public static void main(String[] args) {
        String string1 = getConsoleInput("Enter a numeric value: ");
        String string2 = getConsoleInput("Enter a numeric value: ");
        String string3 = getConsoleInput("Choose an operation (+ - * /):");

        double result;

        try {
            switch (string3) {
                case "+":
                    result = addValues(string1, string2);
                    break;
                case "-":
                    result = subtractValues(string1, string2);
                    break;
                case "*":
                    result = multiplyValues(string1, string2);
                    break;
                case "/":
                    result = divideValues(string1, string2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }

    private static String getConsoleInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
