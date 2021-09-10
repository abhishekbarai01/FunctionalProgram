package com.functionalProgram;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        // Equation = a*x*x + b*x + c
        double secondRoot = 0, firstRoot = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double determinant = (b * b) - (4 * a * c);
        double sqrt = Math.sqrt(determinant);

        if (determinant > 0) {
            firstRoot = (-b + sqrt) / (2 * a);
            secondRoot = (-b - sqrt) / (2 * a);
            System.out.println("Roots are : " + firstRoot + " and " + secondRoot);
        } else if (determinant == 0) {
            System.out.println("Root is : " + (-b + sqrt) / (2 * a));
        }
    }
}