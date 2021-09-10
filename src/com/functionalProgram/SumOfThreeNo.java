package com.functionalProgram;

public class SumOfThreeNo {
    public static void main(String[] args) {
        int array[] = {0, -1, 2, -3, 1};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {

                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println("Sum of three numbers : " + array[i] + "," + array[j] + " and " + array[k]);
                    }
                }
            }
        }
    }
}