package fr.ynov.java.easy;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please enter two numbers!");
            return;
        }
        String s = args[0];
        String r = args[1];

        Scanner operator = new Scanner(System.in);
        System.out.println("Enter your operator: ");
        String operatorName = operator.nextLine();


        int a = Integer.parseInt(s);
        int b = Integer.parseInt(r);

        switch (operatorName) {
            case "+":
                int sum = a + b;
                System.out.println(sum);
                break;
            case "-":
                int diff = a - b;
                System.out.println(diff);
                break;
            case "*":
                int mult = a * b;
                System.out.println(mult);
                break;
            case "/":
                int quo = a / b;
                System.out.println(quo);
                int rest = a % b;
                System.out.println(rest);
                break;
        }
    }
}
