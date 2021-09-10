package com.functionalProgram;

import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {

        // w = 35.74 + 0.6215*t + (0.4275*t - 35.75)  *  v ^ 0.16
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter temperature t: ");
        double t = sc.nextInt();
        System.out.println("Temperature = " + t);

        System.out.println("Please enter speed v: ");
        double v = sc.nextInt();
        System.out.println("Wind speed  = " + v);

        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        System.out.println("Wind chill  = " + w);
    }
}
