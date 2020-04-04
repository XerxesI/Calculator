package com.example.java;

import java.util.Scanner;

import static com.example.java.util.MathMethods.*;

public class Calculator {

    public static void main(String[] args) {
        String string1 = getConsoleInput("Enter a numeric value: ");
        String string2 = getConsoleInput("Enter a numeric value: ");
        String string3 = getConsoleInput("Choose an operation (+ - * /):");

        double calcResult;

        try {
            switch (string3) {
                case "+":
                    calcResult = addValues(string1, string2);
                    break;
                case "-":
                    calcResult = subtractValues(string1, string2);
                    break;
                case "*":
                    calcResult = multiplyValues(string1, string2);
                    break;
                case "/":
                    calcResult = divideValues(string1, string2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }

            System.out.println("The answer is " + calcResult);

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
