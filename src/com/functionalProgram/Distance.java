package com.functionalProgram;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num1: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the value of num2: ");
        double num2 = input.nextDouble();

        double distance = Math.sqrt(num1*num1 + num2*num2);

        System.out.println("Distance : " + distance);


    }

}
