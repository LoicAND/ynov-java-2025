package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        System.out.println("Enter your age: ");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("Your name is " + name + ".");
        System.out.println("Your age is " + age + " years old.");
    }
}
